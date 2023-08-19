import express from "express";
import { getSystemStats, getSystemStatsDisplayHeaders, getSystemStatsPropDisplayNames, getSystemStatsObjPropNames } from "./system-stats-utils.js";

const app = express();

app.set('view engine', 'ejs');

app.get('/', function (req, res, next) {

    const systemStatsObj = getSystemStats();
    console.log(JSON.stringify(systemStatsObj));
    const systemStatsDisplayHeaders = getSystemStatsDisplayHeaders();
    const systemStatsObjPropDisplayNames = getSystemStatsPropDisplayNames();
    const systemStatsPropNames = getSystemStatsObjPropNames(systemStatsObj);

    res.render('system-stats', { 
        systemStatsObj: systemStatsObj,
        systemStatsDisplayHeaders: systemStatsDisplayHeaders,
        systemStatsObjPropDisplayNames:systemStatsObjPropDisplayNames,
        systemStatsPropNames: systemStatsPropNames
    });

});

const HOST = '0.0.0.0';
const PORT = process.env.PORT || 8080;

app.listen(PORT, HOST, () => {
    console.log(`Running on http://${HOST}:${PORT}`);
});

