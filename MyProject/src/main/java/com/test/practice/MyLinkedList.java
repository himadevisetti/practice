package com.test.practice;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {
	
	private Node first; 
	private Node last; 
	private int size; 
	
	public MyLinkedList() {
		first = null; 
		last = null; 
		size = 0; 
	}
	
	private class Node {
		
		private T data; 
		private Node next; 
		
		public Node(T data, Node next) {
			this.data = data; 
			this.next = next; 
		}
		
	}

	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}
	
	public class LinkedListIterator implements Iterator<T> {
		private Node current = first; 
		
		public T next() { 
			
			if (!hasNext()) {
				throw new NoSuchElementException(); 
			}
			
			T data = current.data;
			current = current.next;
			return data; 
		}
		
		public boolean hasNext() {
			return current != null; 
		}
		
		public void remove() {
			throw new UnsupportedOperationException("This operation is unsupported");
		}
		
	}
	
	public void add(T item) {
		if (item == null) {
			throw new NullPointerException("item to be added is not passed"); 
		}
		
		if (!isEmpty()) {
			Node prev = last; 
			last = new Node(item, null); 
			prev.next = last; 
		} else {
			last = new Node(item, null); 
			first = last; 
		}
		size++; 		
	}
	
	public boolean remove(T item) {
		if (isEmpty()) {
			throw new IllegalStateException("remove was called on an empty list");
		}
		
		boolean result = false; 
		Node prev = first; 
		Node curr = first; 
		
		while (curr.data != null | curr == last) {
			if (curr.data.equals(item)) {
				if (size == 1) {
					first = null; 
					last = null; 
				} else if (curr.equals(first)) {
					first = first.next;
				} else if (curr.equals(last)) {
					last = prev; 
					last.next = null; 
				} else {
					prev.next = curr.next; 
				}
				size--; 
				result = true; 
				break; 
			}
			prev = curr; 
			curr = prev.next; 
		}
		
		return result; 
		
	}
	
	public boolean isEmpty() {
		return size == 0; 
	}
	
	public static void main(String[] args) {
		
		MyLinkedList<Integer> myll = new MyLinkedList<Integer>(); 

		myll.add(new Integer(1));
		myll.add(new Integer(2));
		myll.add(new Integer(3));
		
		Iterator<Integer> it = myll.iterator(); 
		
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		myll.remove(new Integer(2)); 

		Iterator<Integer> it2 = myll.iterator(); 
		
		System.out.println("\nAfter Removal");
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}		
		
	}

}
