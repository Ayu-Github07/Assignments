function reverseArray(arr1) {
  let n = arr1.length;

  for (let i = 0; i < n / 2; i++) {
    [arr1[i], arr1[n - i - 1]] = [arr1[n - i - 1], arr1[i]];
  }

  return arr1;
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log("Original Array: ", arr);

let arr1 = reverseArray(arr);
console.log("Reverse of an Array: ", arr1);
