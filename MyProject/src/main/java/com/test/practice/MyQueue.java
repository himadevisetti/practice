package com.test.practice;

public class MyQueue<T> {

	private MyStack<T> inputStack; 
	private MyStack<T> outputStack;
	private int size; 
	
	public MyQueue() {
		inputStack = new MyStack<>(); 
		outputStack = new MyStack<>(); 
	}
	
	public void enqueue(T t) {
		inputStack.push(t); 
		size++; 
	}
	
	public T dequeue() {
		if (outputStack.isEmpty()) {
			while (!inputStack.isEmpty()) {
				outputStack.push(inputStack.pop());
			}
		}
		T temp = null; 
		if (!outputStack.isEmpty()) {
			temp = outputStack.pop(); 
			size--;  
		}
		return temp; 
	}
	
	public boolean isEmpty() {
		return size == 0; 
	}
	
	public int size() {
		return size; 
	}
}
