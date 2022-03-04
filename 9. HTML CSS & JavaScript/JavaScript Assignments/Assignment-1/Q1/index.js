let number = Number(prompt("Enter the value of n: "));

const answer = document.createElement("h3");

let sum = 0;
for (let i = 1; i <= number; i++) {
  sum += i;
}

answer.innerHTML = "Sum of numbers from 1 to " + number + " = " + sum;
document.body.appendChild(answer);
console.log(sum);
