function RightRotate(a, n, k) {
  k = k % n;

  for (let i = 0; i < n; i++) {
    if (i < k) {
      document.write(`${a[n + i - k]} `);
    } else {
      document.write(a[i - k] + " ");
    }
  }
  document.write("<br>");
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let N = arr.length;
let K = 2;

RightRotate(arr, N, K);
