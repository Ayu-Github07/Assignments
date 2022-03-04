let arr1 = [1, 2, 3];
let arr2 = ["a", "b", "c"];

let i = 0;
let arr3 = [];

while (i < arr1.length && i < arr2.length) {
  arr3.push(arr1[i], arr2[i]);
  i += 1;
}

document.write(`<h3>Array 1 = ${arr1}`);
document.write(`<h3>Array 2 = ${arr2}`);
document.write(`<h3>${arr3}</h3>`);
