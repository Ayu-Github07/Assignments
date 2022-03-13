const x = new Promise((resolve, reject) => {
    setTimeout(resolve, 100, 10);
  });
  const y = new Promise((resolve, reject) => {
    setTimeout(resolve, 100, 10);
  });

Promise.all([x, y]).then((values) => {
  console.log(values[0] + values[1]);
});