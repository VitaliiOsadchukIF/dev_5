package org.example;

public class Main {
    public static void main(String[] args) {

        int n = 10;

        System.out.println("Iterative: " + FibonacciSolver.fibonacciIterative(n));
        System.out.println("Recursive: " + FibonacciSolver.fibonacciRecursive(n));
        System.out.println("Dynamic: " + FibonacciSolver.fibonacciDynamic(n));
    }

}
