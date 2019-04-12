package com.test.practice;

import java.util.Arrays;

public class TopScores {

	public static void sortScores(int[] arr, int max) {
		int min = Arrays.stream(arr).min().getAsInt(); 
		int range = max - min + 1; 
		int[] count = new int[range]; 
		int[] output = new int[arr.length]; 
		
		for (int i=0; i<arr.length; i++) {
			count[arr[i] - min]++; 
		}
		
		for (int i=1; i<count.length; i++) {
			count[i] += count[i-1]; 
		}
		
		for (int i=arr.length-1; i>=0; i--) {
			output[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--; 
		}
		
		int j = arr.length-1; 
		for (int i=0; i<arr.length; i++) {
			arr[i] = output[j];
			j--; 
		}
	}
	
	public static void printArray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		int[] unsortedScores = {91, 37, 89, 41, 65, 91, 53};
		sortScores(unsortedScores, 100); 
		printArray(unsortedScores); 

	}

}
