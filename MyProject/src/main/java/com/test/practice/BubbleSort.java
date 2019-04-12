package com.test.practice;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		for (int i=arr.length-1; i>=0; i--) {
			
			for (int j=1; j<=i; j++) {

				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1]; 
					arr[j-1] = arr[j]; 
					arr[j] = temp;  
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		 
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		bubbleSort(input); 
		
		for (int k=0; k<input.length; k++) {
			System.out.print(input[k] + " ");
		}

	}

}
