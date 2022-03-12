function isEven(num) {
  return num % 2 == 0;
}

document.write(`<h3>Output: isEven(3) = ${isEven(3)}</h3>`);
document.write(`<h3>Output: isEven(4) = ${isEven(4)}</h3>`);

let arr = [1, 3, 5, 4, 2];

function find(arr, isEven) {
  for (let i = 0; i < arr.length; i++) {
    if (isEven(arr[i])) {
      return arr[i];
    }
  }
}

document.write(
  `<h3>Output: find([1, 3, 5, 4, 2], isEven) = ${find(arr, isEven)}</h3>`
);
