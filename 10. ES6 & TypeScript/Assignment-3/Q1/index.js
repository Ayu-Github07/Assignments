var x = new Promise(function (resolve, reject) {
    setTimeout(resolve, 100, 10);
});
var y = new Promise(function (resolve, reject) {
    setTimeout(resolve, 100, 10);
});
Promise.all([x, y]).then(function (values) {
    console.log(values[0] + values[1]);
});
