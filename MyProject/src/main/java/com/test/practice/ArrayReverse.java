package com.test.practice;

public class ArrayReverse {

	public static int[] reverse(int[] myArray) {
		int[] myReversedArray = new int[myArray.length]; 
		
		int j = 0; 
		
		for (int i=myArray.length-1; i >= 0; i--) {
			myReversedArray[j] = myArray[i];
			j = j+1; 
		}
		
		return myReversedArray; 
	}

	public static int[] reverse2(int[] myArray) {
		int i, t, n; 
		n = myArray.length; 
		
		for (i=0; i < n/2; i++) {
			t = myArray[i]; 
			myArray[i] = myArray[n - i -1]; 
			myArray[n - i - 1] = t; 
		}
		
		return myArray; 
	}	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};		
		int[] revArray = reverse2(arr);  
		
		for (int k=0; k < revArray.length; k++) {
			System.out.print(revArray[k] + " ");
		}
	}

}
