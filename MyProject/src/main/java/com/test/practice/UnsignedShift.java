package com.test.practice;

public class UnsignedShift {

	// >> signed operator - shifts right and prepends with 0s
	// >>> unsigned operator - shifts right an prepends with 1s
	
	public static void main(String[] args) {
	       int x = 12;   
	       
	       System.out.println(x); 
	       System.out.println(x>>>1);   
	       x = -12;
	       System.out.println(x); 
	       System.out.println(x>>>1); 
	}

}
