package com.test.practice;

public class FizzBuzz {

	public static String fizzbuzz(int n) {
		
		if ((n%3 == 0) && (n%5 == 0)) {
			return "FizzBuzz"; 
		} else if (n%3 == 0) {
			return "Fizz"; 
		} else if (n%5 == 0) {
			return "Buzz"; 
		} 
			
		return String.valueOf(n); 
		
	}
	
	
	public static void main(String[] args) {
		
		int n1 = 15; 
		System.out.println("FB of n1: " + fizzbuzz(n1));

		int n2 = 10; 
		System.out.println("FB of n2: " + fizzbuzz(n2));
		
		int n3 = 9; 
		System.out.println("FB of n3: " + fizzbuzz(n3));
	
		int n4 = 16; 
		System.out.println("FB of n4: " + fizzbuzz(n4));
		
	}

}
