function longestToken(str) {
  let prev_Len = 0,
    curr_Len = 0;
  let finalStr = null;
  let i = 0,
    j = 0;

  console.log("String lenght: ", str.length);
  for (i = 0; i < str.length; i++) {
    curr_Len = 0;
    if (str[i] != "a" || str[i] != "b" || str[i] != "c") {
      for (j = i + 1; j < str.length; j++) {
        if (str[j] == "a" || str[j] == "b" || str[j] == "c") {
          break;
        }
        curr_Len += 1;
      }
    }
    prev_Len = Math.max(prev_Len, curr_Len);
  }

  return prev_Len;
}

let str = prompt("Enter the String: ");
console.log("Longest string lenght: ", longestToken(str));
