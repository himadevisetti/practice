package com.test.practice;

public class DemoQueue {

	public static void main(String[] args) {
		
		MyQueue<Integer> myQ = new MyQueue<>(); 
		
		for (int i=1; i<=3; i++) {
			myQ.enqueue(i);
		}

		for (int i=0; i<2; i++) {
			System.out.println("dequeued " + myQ.dequeue());
		}

		for (int i=4; i<=5; i++) {
			myQ.enqueue(i);
		}		
		
		while (!myQ.isEmpty()) {
			System.out.println("dequeued " + myQ.dequeue());
		}
	}

}
