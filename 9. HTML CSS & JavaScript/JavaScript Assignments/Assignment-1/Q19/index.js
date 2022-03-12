function MyCalculato() {
  var n = prompt("Enter the number between 1 to 7");
  var a = prompt("Enter number 1");
  var b = prompt("Enter number 2");

  var ch = parseInt(n);
  var n1 = parseInt(a);
  var n2 = parseInt(b);

  if (n == 1) {
    document.write(`Addition of two numbers: ${n1 + n2}`);
  } else if (n == 2) {
    document.write(`${n1 - n2}`);
  } else if (n == 3) {
    document.write(`${n1 * n2}`);
  } else if (n == 4) {
    document.write(`${n1 / n2}`);
  } else if (n == 5) {
    document.write(`${Math.pow(n1, n2)}`);
  } else if (n == 6) {
    document.write(`${n1 + n2}/2`);
  } else {
    document.write(`Enter the number between 1 and 7`);
  }
}
