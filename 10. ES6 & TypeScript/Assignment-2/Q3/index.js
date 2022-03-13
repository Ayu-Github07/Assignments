var lowNumber2 = 9;
function armstrong2() {
    for (var i = lowNumber2; i > 0; i++) {
        var numberOfDigits = i.toString().length;
        var sum = 0;
        var temp = i.toString();
        for (var _i = 0, temp_1 = temp; _i < temp_1.length; _i++) {
            var char = temp_1[_i];
            sum += Math.pow(parseInt(char), numberOfDigits);
        }
        if (sum == i) {
            console.log(i);
            lowNumber2 = i;
            break;
        }
    }
}
function getNextArmstrong2() {
    lowNumber2++;
    armstrong2();
}
function reset() {
    lowNumber2 = 9;
}
armstrong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
reset();
armstrong2();
getNextArmstrong2();
getNextArmstrong2();
getNextArmstrong2();
