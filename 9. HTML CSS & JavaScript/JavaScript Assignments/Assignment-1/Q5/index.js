let year = 2022;

let count = 0;

let element = document.createElement("h3");

let arr = [];
while (count != 20) {
  if (year % 4 == 0) {
    if (year % 100 == 0) {
      if (year % 400 == 0) {
        arr.push(year);
        count++;
      }
    } else {
      arr.push(year);
      count++;
    }
  }
  year++;
}

element.innerHTML = arr;
document.body.appendChild(element);
