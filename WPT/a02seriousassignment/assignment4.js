const express = require('express');
const app = express();

app.use(express.static("cp")) ;


app.get("/addItem",(req,resp)=>{

    resp.send("Add Item needs to be done")
});

app.get("/updateItem",(req,resp)=> {
    resp.send("Update Item needs to be done");
});

app.listen(900, function () {
    console.log("server listening at port 900...");
});