package com.test.practice;

import java.util.Stack;

public class SortStack {

	public static void sortStack(Stack<Integer> s) {
		
		Stack<Integer> temp = new Stack<Integer>(); 
		
		while (!s.isEmpty()) {
			
			int s1 = (int) s.pop(); 
			
			while (!temp.isEmpty() && temp.peek() > s1) {
				s.push(temp.pop()); 
			}
			temp.push(s1); 
		}
		
		System.out.println(temp);
		
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(3);
		stack.add(5); 
		stack.add(9); 
		stack.add(2); 
		stack.add(1); 
		stack.add(6); 
		
		sortStack(stack); 

	}

}
