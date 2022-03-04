let arr1 = [1, 2, 3];
let arr2 = ["a", "b", "c"];

let element = document.createElement("h3");
element.innerHTML = arr1.concat(arr2);
document.body.appendChild(element);
