var sum = 0;
var count = 0;
for (var i = 2; i < 30; i++) {
    var isPrime = true;
    if (i == 2) {
        sum += i;
        count++;
        continue;
    }
    for (var j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
            isPrime = false;
            break;
        }
    }
    if (!isPrime) {
        continue;
    }
    sum += i;
    count++;
}
console.log("Tong cua 30 so ng to dau tien la ".concat(sum, " voi so lan la dem la ").concat(count));
