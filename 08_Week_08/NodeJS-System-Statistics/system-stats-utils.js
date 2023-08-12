import osutils from "os-utils";
import ip from "ip";

const getSystemStats = () => {

  const serverStats = {}

  serverStats.ipAddress = ip.address();
  serverStats.platform = osutils.platform();
  serverStats.noOfCPUs = osutils.cpuCount();

  osutils.cpuUsage(function(v) {
    console.log("CPU Usage (%) : " + v);
  });

  serverStats.loadAvg5Mins = osutils.loadavg(5);
  serverStats.totalMemoryInMB = osutils.totalmem() + " MB";
  serverStats.freeMemoryInMB = osutils.freemem() + " MB";

  const upTimeInMins = fromSecondsToMins(osutils.sysUptime());
  serverStats.systemUptimeInMins = `${upTimeInMins} Mins`;

  const appUpTimeInMins = fromSecondsToMins(osutils.processUptime());
  serverStats.appUpTimeInMins = `${appUpTimeInMins} Mins`;

  return serverStats;
} 

const getSystemStatsPropDisplayNames = () => {
  return ["IP Address", "Platform", "Number of CPUs", "Load Average (5m)", "Total Memory", "Free Memory", "System Uptime (in Mins)", "Application Uptime (in Mins)"]
}

const getSystemStatsObjPropNames = (obj) => {

  return Object.getOwnPropertyNames(obj);
}

const getSystemStatsDisplayHeaders = () => {
  return ["Name", "Value"];
}

function fromMilliSecondsToMins(value){
  return value / (1000 * 60);
}

function fromSecondsToMins(value){
  return value / (60);
}

export {getSystemStats, getSystemStatsPropDisplayNames, getSystemStatsObjPropNames, getSystemStatsDisplayHeaders};
