class rectangle {
  constructor(width, height) {
    this.width = width;
    this.height = height;
  }
}
rectangle.prototype.getArea = function () {
  return this.width * this.height;
};
myRectangle = new rectangle(10, 5);

document.write(
  `<h3>Output: Width = ${myRectangle.width} , Height = ${myRectangle.height}</h3>`
);

document.write(`<h3>Output Area = ${myRectangle.getArea()}</h3>`);
