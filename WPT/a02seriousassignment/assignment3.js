const http = require('http');
let url = require("url");

http.createServer((req,res)=>{

    let queryParam = url.parse(req.url, true).query;
    let radius = queryParam.radius;
        console.log("Diameter: " + radius*2);
        res.write("Diameter: " + radius*2);
        res.end();


}).listen(800);
