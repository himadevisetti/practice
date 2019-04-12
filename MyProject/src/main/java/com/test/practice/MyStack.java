package com.test.practice;

public class MyStack<T> {

	private class Node<T> {
		
		T data; 
		Node<T> next; 
		
		public Node(T data) {
			this.data = data; 
		}
		
	}
	
	private Node<T> head; 
	private int size; 
	
	public void push(T t) {
		
		Node<T> new_node = new Node<>(t);
		if (head == null) {
			head = new_node; 
		} else {
			new_node.next = head; 
			head = new_node; 
		}
		size++; 
	}
	
	public T pop() {
		
		if (head == null) {
			return null; 
		}
		
		T data = head.data; 
		head = head.next; 
		
		size--; 
		return data; 
	}
	
	public int size() {
		return size; 
	}
	
	public boolean isEmpty() {
		return size == 0; 
	}
	
	public void printStack() {
		if (size == 0) {
			System.out.print("Empty stack");
		} else {
			for (Node<T> temp=head; temp!=null; temp=temp.next) {
				System.out.printf("%s", temp.data); 
				System.out.printf("\n");
			}
		}
	}
}
