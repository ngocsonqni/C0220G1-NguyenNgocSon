$.ajax({
    type: "POST", //GET, DELETE, PUT...
    url: "json/info.json",
    data: "{empid: " + empid + "}",
    contentType: "application/json; charset=utf-8",
    dataType: "json",
    // dataType: "text",
    success: function(result){
        alert(result.d);
        console.log(result);
    },
    fail: function(result) {
    }
});
