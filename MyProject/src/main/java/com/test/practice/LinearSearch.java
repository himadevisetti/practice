package com.test.practice;

public class LinearSearch {

	public void linearSearch(int[] myArray, int searchKey) {
		
		boolean found = false; 
		for (int i=0; i < myArray.length; i++) {
			if (searchKey == myArray[i]) {
				System.out.println("Key found at " + i);
				found = true; 
			}
		}
		if (found == false) {
			System.out.println("Key not found in the array");
		}
	}
	
	public static void main(String[] args) {
		
		LinearSearch ls = new LinearSearch(); 

		int[] myA = {1,2,3,4,5,6};
		ls.linearSearch(myA, 4);
	}

}
