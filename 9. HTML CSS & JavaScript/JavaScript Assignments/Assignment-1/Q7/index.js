let currency = prompt("Enter the currency value in dollars: ");
const inr = currency * 74.28;
const yen = currency * 109.14;
const euro = currency * 0.84;
const pound = currency * 0.72;

let arr = {
  "Indian Rupee": inr,
  "Japanese Yen": yen,
  Euro: euro,
  "Pound Sterling": pound,
};

document.write(`<h3>Currency in dollars is = ${currency}</h3>`);
for (const key in arr) {
  document.write(`<h3>${key} = ${arr[key]} </h3>`);
}
