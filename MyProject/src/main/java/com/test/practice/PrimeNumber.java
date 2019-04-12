package com.test.practice;

public class PrimeNumber {

	public static boolean prime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= n / i; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		int k = 10; 
		boolean result = prime(k); 
		System.out.println("Number " + k + " is a prime number? " + result);

	}

}
