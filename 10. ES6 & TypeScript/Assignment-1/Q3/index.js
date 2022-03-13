"use strict";

var order = {
  id: 123,
  title: "book",
  price: 500,
  printorder: function () {
    return this.id;
  },
  getPrice: function () {
    return this.price;
  },
};
var order2 = Object.assign({}, order);
console.log(order);
console.log(order2);
