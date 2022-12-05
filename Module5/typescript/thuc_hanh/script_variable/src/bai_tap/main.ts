// @ts-ignore
function fibonacci(num: number) {
    if (num <= 2) {
        return 1;
    }
    return fibonacci(num - 1) + fibonacci(num - 2);
}

let newArr: Array<number> = [];
for (let i = 2; i < 10; i++) {
    newArr.push(fibonacci(i));
}

console.log(newArr)