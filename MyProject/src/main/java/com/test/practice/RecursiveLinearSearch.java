package com.test.practice;

public class RecursiveLinearSearch {

	public int recLinearSearch(int[] arr, int l, int r, int x) {
		
		if (r < l) 
			return -1; 
		if (arr[l] == x)
			return l;
		if (arr[r] == x)
			return r;
		return recLinearSearch(arr, l+1, r-1, x);
		
	}
	
	public static void main(String[] args) {
		
		RecursiveLinearSearch rls = new RecursiveLinearSearch(); 
		
		int[] myA = {1,2,3,4,5,6};
		int x = 7; 
		int index = rls.recLinearSearch(myA, 0, myA.length-1, x); 
		
		if (index == -1) 
			System.out.println("Key not found");
		else 
			System.out.println("Key found at " + index);
	}

}
