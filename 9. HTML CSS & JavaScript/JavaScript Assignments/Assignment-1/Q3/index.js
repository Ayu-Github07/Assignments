function OddEven(number) {
  if (number % 2 == 0) {
    return `Number ${number} is Even`;
  } else {
    return `Number ${number} is Odd`;
  }
}

let number = prompt("Enter the number: ");

const element = document.createElement("h3");
element.innerHTML = OddEven(number);

document.body.appendChild(element);
