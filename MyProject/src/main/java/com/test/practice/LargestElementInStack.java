package com.test.practice;

import java.util.Stack;

public class LargestElementInStack {

	Stack<Integer> mainStack = new Stack<Integer>(); 
	Stack<Integer> trackStack = new Stack<Integer>();
	
	public void push(int x) {
		
		mainStack.push(x); 
		if (mainStack.size() == 1) {
			trackStack.push(x); 
			return; 
		}
		
		if (x > trackStack.peek()) {
			trackStack.push(x); 
		} else {
			trackStack.push(trackStack.peek()); 
		}
		
	}
	
	public int getMax() {
		return trackStack.peek(); 
	}
	
	public void pop() {
		mainStack.pop(); 
		trackStack.pop(); 
	}
	
	public static void main(String[] args) {
		
		LargestElementInStack leis = new LargestElementInStack(); 
		leis.push(20);
		System.out.println("Largest element in the stack is: " + leis.getMax());
		leis.push(10);
		System.out.println("Largest element in the stack is: " + leis.getMax());
		leis.push(50);
		System.out.println("Largest element in the stack is: " + leis.getMax());
		leis.pop();
		System.out.println("Second Largest element in the stack is: " + leis.getMax());
	}

}
