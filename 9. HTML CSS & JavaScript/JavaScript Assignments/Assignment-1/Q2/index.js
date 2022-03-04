let number = prompt("Enter the value of n: ");

let sum = 0;
let arr = [];

for (let i = 1; i <= number; i++) {
  if (i % 3 == 0 && i % 5 == 0) {
    arr.push(i);
    sum += i;
  } else if (i % 3 == 0) {
    arr.push(i);
    sum += i;
  } else if (i % 5 == 0) {
    arr.push(i);
    sum += i;
  }
}

const element1 = document.createElement("h3");
const element2 = document.createElement("h3");

element1.innerHTML =
  "Sum of multiples of three or five upto " + number + " is: " + sum;

document.body.appendChild(element1);

element2.innerHTML = "Multples of 3 or 5 upto " + number + " is: " + arr;

document.body.appendChild(element2);
