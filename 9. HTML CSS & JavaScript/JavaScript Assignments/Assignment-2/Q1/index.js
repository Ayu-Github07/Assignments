let square = (num) => {
  return Math.pow(num, 2);
};

let double = (num) => {
  return num * 2;
};

let composedValue = (square, double, x) => {
  return square(double(x));
};

document.write(`<h3>Output: ${composedValue(square, double, 5)}</h3>`);
