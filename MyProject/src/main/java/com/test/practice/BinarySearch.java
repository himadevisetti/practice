package com.test.practice;

public class BinarySearch {

	public void binarySearch(int[] myArray, int searchKey) {
		
		int n = myArray.length; 
		int mid = n/2; 
		
		if (searchKey == myArray[mid]) {
			System.out.println("Key found at " + mid);
		} else if (searchKey < myArray[mid]) {
			for (int i=0; i < mid; i++) {
				if (searchKey == myArray[i]) {
					System.out.println("Key found at " + i);
				}
			}
		} else if (searchKey > myArray[mid]) {
			for (int j=mid+1; j < n; j++) {
				if (searchKey == myArray[j]) {
					System.out.println("Key found at " + j);
				}
			}
			System.out.println("Key not found in the array");
		}
		
	}
	
	public static void main(String[] args) {
		
		BinarySearch bs = new BinarySearch(); 
		
		int[] myA = {1,2,3,4,5,6};
		bs.binarySearch(myA, 7);

	}

}
