const text = '[ "Ayush", "Agrawal" ]';
const myArr = JSON.parse(text);

document.write(`<h3>First Name: ${myArr[0]}</h3>`);
document.write(`<h3>Last Name: ${myArr[1]}</h3>`);
