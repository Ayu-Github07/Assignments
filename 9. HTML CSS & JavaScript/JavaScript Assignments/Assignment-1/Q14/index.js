let randomArray = Array.from({ length: 100 }, () =>
  Math.floor(Math.random() * 100)
);

console.log(randomArray);

let max = randomArray[0];
let min = randomArray[0];

for (let i = 1; i < randomArray.length; i++) {
  max = Math.max(max, randomArray[i]);
  min = Math.min(min, randomArray[i]);
}

document.write(`<h3>a) Maximum element in the random array is: ${max}</h3>`);

document.write(`<h3>b) Minimum element in the random array is: ${min}</h3>`);

let oddCount = 0,
  evenCount = 0,
  sum = 0;

for (let i = 0; i < randomArray.length; i++) {
  if (randomArray[i] % 2 == 0) {
    evenCount++;
  } else {
    oddCount++;
  }
  sum += randomArray[i];
}

if (evenCount > oddCount) {
  document.write(`<h3>c) Even count is higher</h3>`);
} else if (oddCount > evenCount) {
  document.write(`<h3>c) Odd count is higher<h3>`);
} else {
  document.write(`<h3>c) Odd and Even Counts are same`);
}

document.write(
  `<h3>d) Sum of the Array is: ${sum}</h3>\n<h3>Average of the array is: ${
    sum / 100
  }</h3>`
);
