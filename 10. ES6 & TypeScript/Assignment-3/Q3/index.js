var Circle = /** @class */ (function () {
    function Circle(radius) {
        this.radius = radius;
        this.area = 3.18 * radius * radius;
    }
    Circle.prototype.print = function () {
        console.log(this.radius);
        console.log(this.area);
    };
    return Circle;
}());
var Employee = /** @class */ (function () {
    function Employee(id, name) {
        this.id = id;
        this.name = name;
    }
    Employee.prototype.print = function () {
        console.log("Id: " + this.id + " \nName: " + this.name);
    };
    return Employee;
}());
var circle = new Circle(2);
var employee = new Employee(101, "Hritik");
function PrintAll(obj1, obj2) {
    obj1.print();
    obj2.print();
}
PrintAll(circle, employee);
