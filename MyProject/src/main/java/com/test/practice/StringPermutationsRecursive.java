package com.test.practice;

public class StringPermutationsRecursive {
	
	public static void permutations(String str, String remaining) {
		
		if (remaining.length() == 0) {
			System.out.println(str);
		}
		
		for (int i=0; i<remaining.length(); i++) {
			
			String newStr = str + remaining.charAt(i); 
			String newRemaining = remaining.substring(0,i) + remaining.substring(i+1); 
			
			permutations(newStr, newRemaining); 
			
		}
	}
	
	public static void main(String[] args) {
		
		String s = "ABC"; 
		permutations("", s); 

	}

}
