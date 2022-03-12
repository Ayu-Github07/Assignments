let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

document.write(`<h1>Using for loop: </h1>`);

let sum = 0;

for (let i = 0; i < arr.length; i++) {
  sum += arr[i];
}

document.write(`<h1>Sum of all the elements in array: ${sum}`);

document.write(`<h1>Using while loop: </h1>`);

sum = 0;
let i = 0;

while (i < arr.length) {
  sum += arr[i];
  i++;
}

document.write(`<h1>Sum of all the elements in array: ${sum}`);

document.write(`<h1>Using do while loop: </h1>`);

sum = 0;
i = 0;

do {
  sum += arr[i];
  i++;
} while (i < arr.length);

document.write(`<h1>Sum of all the elements in array: ${sum}`);
