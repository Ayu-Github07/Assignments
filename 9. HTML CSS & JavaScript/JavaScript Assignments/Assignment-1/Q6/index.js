let list = ["Hello", "World", "in", "a", "frame"];

let element1 = document.createElement("h3");
let element2 = document.createElement("h3");

let element4 = document.createElement("h3");

element1.innerHTML = "Output: ";
document.body.appendChild(element1);

element2.innerHTML = "*********";
document.body.appendChild(element2);
list.forEach(function (element) {
  let element3 = document.createElement("h3");
  let str = element;
  str = "*" + element + "*";
  element3.innerText = str;
  document.body.appendChild(element3);
});
element4.innerHTML = "*********";
document.body.appendChild(element4);
