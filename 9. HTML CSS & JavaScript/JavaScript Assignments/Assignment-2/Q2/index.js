let square = (num) => {
  return Math.pow(num, 2);
};

let double = (num) => {
  return num * 2;
};

let f1 = (square, double, x) => {
  return square(double(x));
};

let f2 = (double, square, x) => {
  return double(square(x));
};

document.write(`<h3>Output: f1(5) = ${f1(square, double, 5)}</h3>`);
document.write(`<h3>Output: f1(10) = ${f1(square, double, 10)}</h3>`);

document.write(`<h3>Output: f2(5) = ${f2(double, square, 5)}</h3>`);
document.write(`<h3>Output: f2(10) = ${f2(double, square, 10)}</h3>`);
