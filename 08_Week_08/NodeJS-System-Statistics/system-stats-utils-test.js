
import {getSystemStats} from "./system-stats-utils.js";

function testServerStats() {

    const serverStats = getSystemStats();
    console.log(serverStats);
    
}

testServerStats();