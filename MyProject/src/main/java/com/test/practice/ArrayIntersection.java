package com.test.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {3,4,5,6,7};
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		int i = 0, j = 0; 
		List<Integer> myList = new ArrayList<Integer>(); 
		
		while (i < a1.length && j < a2.length) {
			if (a1[i] > a2[j]) {
				j++; 
			} else if (a1[i] < a2[j]) {
				i++; 
			} else {
				myList.add(a1[i]); 
				i++; 
				j++; 
			}
		}
		
		System.out.println(myList);
		
	}

}
