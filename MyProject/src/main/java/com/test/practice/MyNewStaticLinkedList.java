package com.test.practice;

public class MyNewStaticLinkedList {

	Node head; 
	
	static class Node {
		int data; 
		Node next; 
		
		Node(int data, Node next) {
			this.data = data; 
			this.next = next; 
		}
	}
	
	public static MyNewStaticLinkedList insert(MyNewStaticLinkedList list, int data) {
		Node new_node = new Node(data, null); 
		
		if (list.head == null) {
			list.head = new_node; 
		} else {
			Node last = list.head; 
			while (last.next != null) {
				last = last.next; 
			}
			last.next = new_node; 
		}
		return list;
	}
	
	public static void printList(MyNewStaticLinkedList list) {
		Node curr = list.head; 
		
		System.out.println("My LinkedList: "); 
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next; 
		}
		System.out.println("\n");
	}
	
	public static MyNewStaticLinkedList deletebyKey(MyNewStaticLinkedList list, int key) {
		Node curr = list.head, prev = null; 
		
		if (curr != null && curr.data == key) {
			list.head = curr.next;  
			System.out.println(key + " found and deleted");
			return list; 
		}
		
		while (curr != null && curr.data != key) {
			prev = curr; 
			curr = curr.next; 
		}
		
		if (curr != null) {
			prev.next = curr.next; 
			System.out.println(key + " found and deleted");
		}
		
		if (curr == null) {
			System.out.println(key + " not found");
		}
		
		return list; 
	}
	
	public static MyNewStaticLinkedList deleteAtPosition(MyNewStaticLinkedList list, int index) {
		
		Node curr = list.head, prev = null; 
		
		if (index == 0 && curr != null) {
			list.head = curr.next; 
			System.out.println(index + " position element deleted");
			return list; 
		}
		
		int counter = 0; 
		while (curr != null) {
			if (counter == index) {
				prev.next = curr.next; 
				System.out.println(index + " position element deleted");
				break;
			} else {
				prev = curr; 
				curr = curr.next; 
				counter++; 
			}
		}
		
		if (curr == null) {
			System.out.println(index + " position not found");
		}
		return list; 
	}
	
	public static void printMiddleElement(MyNewStaticLinkedList list) {
		
		Node slow_ptr = list.head; 
		Node fast_ptr = list.head; 
		
		if (list.head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next; 
				slow_ptr = slow_ptr.next; 
			}
			System.out.println("The middle element is [" + slow_ptr.data + "] \n");
		}
		
	}
	
	public static void main(String[] args) {
		
		MyNewStaticLinkedList myll = new MyNewStaticLinkedList(); 
		myll = insert(myll, 1); 
		myll = insert(myll, 2);
		myll = insert(myll, 3);
		myll = insert(myll, 4);
		myll = insert(myll, 5);
		myll = insert(myll, 6);
		myll = insert(myll, 7);
		
		printList(myll); 
		printMiddleElement(myll);
		
		deletebyKey(myll, 4);
		printList(myll);
		
		deleteAtPosition(myll, 2);
		printList(myll);
		
		deletebyKey(myll, 8);
		printList(myll);
		
		deleteAtPosition(myll, 10);
		printList(myll); 
	}

}
