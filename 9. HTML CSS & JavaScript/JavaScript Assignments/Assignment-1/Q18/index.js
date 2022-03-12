let str = prompt("Enter the string: ");
let finalStr = "";
const array = str.split(" ");

for (let i = 0; i < array.length; i++) {
  let char = array[i].slice(0, 1);
  let char2 = char.concat("ay");
  let result = array[i].slice(1).concat(char2);

  finalStr += result + " ";
}

document.write(`<h1>${finalStr}</h1>`);
