function fibonacci(num) {
    if (num <= 2) {
        return 1;
    }
    return fibonacci(num - 1) + fibonacci(num - 2);
}
let newArr = [];
for (let i = 2; i < 10; i++) {
    newArr.push(fibonacci(i));
}
console.log(newArr);
//# sourceMappingURL=main.js.map