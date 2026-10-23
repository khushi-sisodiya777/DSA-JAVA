function factorialIterative(n) {
    let fact = 1;

    for (let i = 1; i <= n; i++) {
        fact *= i;
    }

    return fact;
}

function factorialRecursive(n) {
    if (n === 0 || n === 1) {
        return 1;
    }

    return n * factorialRecursive(n - 1);
}

let n = 5;

console.log("Number:", n);
console.log("Factorial using Iterative:", factorialIterative(n));
console.log("Factorial using Recursive:", factorialRecursive(n));