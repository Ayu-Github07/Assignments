function square(value) {
  return value * value;
}
function process(arr, func) {
  var arr2 = [];
  for (var i = 0; i < arr.length; i++) {
    arr2.push(func(arr[i]));
  }
  return arr2;
}

const map = (arr, fun) => process(arr, fun);
document.write(`<h3>output 1: ${map([1, 2, 3, 4, 5], square)}</h3>`);
document.write(`<h3>output 2: ${map([1, 4, 9, 16, 25], Math.sqrt)}</h3>`);
