package com.test.practice;

public class FactorialAndFibonacciSeries {

	public static int factRecursive(int n) {
		
		if (n == 1) {
			return 1; 
		} else {
			return n * factRecursive(n-1); 
		}	
	}
	
	public static int factIterative(int n) {
		
		int product = 1; 
		for (int i=2; i<=n; i++) {
			product *= i; 
		}
		return product; 
	}
	
	public static int fibRecursive(int n) {
		
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1; 
		} else {
			return fibRecursive(n-1) + fibRecursive(n-2); 
		}
	}
	
	public static int fibIterative(int n) {
		
		int fib = 0; 
		int a = 1; 
		int temp; 
		
		for (int i=0; i<n; i++) {
			temp = fib; 
			fib = fib + a;
			a = temp; 
		}
		return fib; 
	}
	
	public static void main(String[] args) {
		
		int factRecursive = FactorialAndFibonacciSeries.factRecursive(4); 
		System.out.println("Factorial calculated by recursive function: " + factRecursive);
		
		int factIterative = FactorialAndFibonacciSeries.factIterative(4); 
		System.out.println("Factorial calculated by iterative function: " + factIterative);

		int fibRecursive = FactorialAndFibonacciSeries.fibRecursive(6); 
		System.out.println("Fibonacci number calculated by recursive function: " + fibRecursive);
		
		int fibIterative = FactorialAndFibonacciSeries.fibIterative(6); 
		System.out.println("Fibonacci number calculated by iterative function: " + fibIterative);
		
	}

}
