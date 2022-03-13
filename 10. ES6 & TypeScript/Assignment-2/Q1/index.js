var MyClass = /** @class */ (function () {
    function MyClass(current) {
        this.previousNo = fibonacci(this.currentNo - 1);
        this.currentNo = this.currentNo;
    }
    MyClass.prototype.next = function () {
        return fibonacci(this.currentNo + 1);
    };
    return MyClass;
}());
var fibonacci = function (num) {
    var a = 0, b = 1, f = 1;
    for (var i = 2; i <= num; i++) {
        f = a + b;
        a = b;
        b = f;
    }
    return f;
};
var myClass = new MyClass(5);
console.log(MyClass(5));
