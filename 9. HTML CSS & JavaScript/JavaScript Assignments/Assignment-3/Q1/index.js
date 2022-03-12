class rectangle {
  constructor(width, height) {
    this.width = width;
    this.height = height;
  }
}

myRectangle = new rectangle(10, 5);

document.write(
  `Output: Width = ${myRectangle.width} , Height = ${myRectangle.height}`
);
