package com.test.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitializeArrayList {

	public static void main(String[] args) {
		
		List<Integer> myAl = new ArrayList<Integer>(); 
		myAl.add(1); 
		myAl.add(2); 
		myAl.add(3); 
		
		System.out.println(myAl);
		
		List<String> myStrAl = new ArrayList<String>(Arrays.asList("My", "name", "is", "HD"));
		
		System.out.println(myStrAl);
		
		List<String> myStrAl2 = new ArrayList<String>(); 
		myStrAl2.add("Have");
		myStrAl2.add("a"); 
		myStrAl2.add("lovely");
		myStrAl2.add("weekend");
		
		List<String> myStrAl3 = new ArrayList<String>(myStrAl2);
		System.out.println(myStrAl3);
	}

}
