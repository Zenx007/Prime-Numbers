# 🔢 Prime Number Verifier

![Java](https://img.shields.io/badge/Java-23%2B-ED8B00?logo=openjdk&logoColor=green)

A simple Java program that checks whether a number is prime, with interactive user input.

## ✨ Features

- **Prime number verification** using optimized algorithm
- **Interactive console interface** with continuous operation
- **Input validation** for numbers
- **Clean code structure** with separate verification method

## 🧮 Algorithm Explanation

The program uses an optimized primality test that:
1. Handles edge cases (numbers ≤ 1, 2, and 3)
2. Checks divisibility by 2 and 3 first
3. Only checks divisors of form 6k ± 1 up to √n

```java
public static boolean verificarPrimo(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }
    }
    return true;
}
