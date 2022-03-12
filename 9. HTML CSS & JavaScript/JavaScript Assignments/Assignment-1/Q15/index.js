function BubbleSort(randomArray) {
  for (let i = 0; i < randomArray.length; i++) {
    for (let j = i + 1; j < randomArray.length; j++) {
      if (randomArray[i] > randomArray[j]) {
        [randomArray[i], randomArray[j]] = [randomArray[j], randomArray[i]];
      }
    }
  }
  return randomArray;
}

let randomArray = Array.from({ length: 20 }, () =>
  Math.floor(Math.random() * 100)
);

document.write(`<h2>Original Array is`);
document.write(`<h2>${randomArray}</h2>`);

document.write(`<h2>Array After Sorting in Ascending order: </h2>`);
document.write(`<h2>${BubbleSort(randomArray)}</h2>`);
