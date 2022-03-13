function OddEven(num) {
    if (num % 2 == 0) {
        return "Even";
    }
    else {
        return "Odd";
    }
}
document.write("<h3>Output: Is 1025678 is Even or Odd: ".concat(OddEven(1025678), "</h3>"));
