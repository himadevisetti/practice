package com.test.practice;

public class RecursiveBinarySearch {

	public int recBinSearch(int[] arr, int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r-l) / 2;
			if (arr[mid] == x) 
				return mid;

			if (arr[mid] > x) 
				return recBinSearch(arr, l, mid-1, x);

			return recBinSearch(arr, mid+1, r, x);
		}
		return -1; 
	}

	public static void main(String[] args) {

		int[] myA = { 1, 2, 3, 4, 5, 6 };
		int x = 4;
		RecursiveBinarySearch rbs = new RecursiveBinarySearch();
		int index = rbs.recBinSearch(myA, 0, myA.length-1, x);
        if (index == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + index); 
	}

}
