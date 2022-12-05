let sum = 0;
let count = 0;
for (let i = 2; i < 30; i++) {
    let isPrime = true;
    if (i == 2) {
        sum += i;
        count++;
        continue;
    }
    for (let j = 2; j <= Math.sqrt(i); j++) {
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
console.log(`Tong cua 30 so ng to dau tien la ${sum} voi so lan la dem la ${count}`);
//# sourceMappingURL=main.js.map