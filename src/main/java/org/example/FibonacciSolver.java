package org.example;

public class FibonacciSolver {

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }

    public static int fibonacciRecursive(int n) {

        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciDynamic(int n) {

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
