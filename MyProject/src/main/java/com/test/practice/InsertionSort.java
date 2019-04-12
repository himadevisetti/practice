package com.test.practice;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		
		for (int i=1; i<arr.length; i++) {
			
			int index = arr[i]; int j = i; 
			while (j > 0 && arr[j-1] > index) {
				
				arr[j] = arr[j-1]; 
				j--; 
				
			}
			arr[j] = index; 
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		insertionSort(input); 
		
		for (int k=0; k<input.length; k++) {
			System.out.print(input[k] + " ");
		}

	}

}
