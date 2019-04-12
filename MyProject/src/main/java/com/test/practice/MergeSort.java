package com.test.practice;

public class MergeSort {

	public static void mergeSort(int[] a, int n) {
		
		if (n < 2) 
			return; 
		
		int mid = n/2; 
		int[] l = new int[mid];
		int[] r = new int[n - mid]; 
		
		for (int i=0; i<mid; i++) {
			l[i] = a[i]; 
		}
		
		for (int i=mid; i<n; i++) {
			r[i-mid] = a[i]; 
		}
		
		mergeSort(l, mid); 
		mergeSort(r, n-mid); 
		merge(a, l, r, mid, n-mid); 
	}
	
	public static void merge(int[] a, int[] l, int[] r, int left, int right) {
		
		int i=0, j=0, k=0; 
		
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++]; 
			} else {
				a[k++] = r[j++];
			}
		}
		
		while (i < left) {
			a[k++] = l[i++]; 
		}
		
		while (j < right) {
			a[k++] = r[j++]; 
		}
	}
	
	public static void main(String[] args) {
		
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		mergeSort(input, input.length); 
		
		for (int k=0; k<input.length; k++) {
			System.out.print(input[k] + " ");
		}

	}

}
