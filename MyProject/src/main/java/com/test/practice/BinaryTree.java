package com.test.practice;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	Node root; 
	
	class Node {
		int value; 
		Node left; 
		Node right;
		
		public Node(int value) {
			this.value = value; 
			left = null; 
			right = null; 
		}
	}
	
	public void add(int value) {
		root = addRecursive(root, value); 
	}
	
	public Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value); 
		}
		
		if (value < current.value) {
			current.left = addRecursive(current.left, value); 
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value); 
		}
		return current; 
	}

	public boolean isEmpty() {
		return root == null; 
	}
	
	public int getSize() {
		return getSizeRecursive(root);
	}
	
	public int getSizeRecursive(Node current) {
		return (current == null) ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right); 
	}
	
	public boolean search(int value) {
		return searchRecursive(root, value);
	}
	
	public boolean searchRecursive(Node current, int value) {
		if (current == null) {
			return false; 
		}
		
		if (value == current.value) {
			return true; 
		}
		
		return value < current.value 
				? searchRecursive(current.left, value)
				: searchRecursive(current.right, value); 
	}
	
	public Node delete(int value) {
		return deleteRecursive(root, value); 
	}
	
	public Node deleteRecursive(Node current, int value) {
		if (current == null) {
			return null; 
		}
		
		if (value == current.value) {
			
			if (current.left == null && current.right == null) {
				return null; 
			}
			
			if (current.left == null) {
				return current.right; 
			}
			
			if (current.right == null) {
				return current.left; 
			}
			
			int smallestIntValue = findSmallestIntValue(current.right); 
			current.value = smallestIntValue; 
			current.right = deleteRecursive(current.right, smallestIntValue); 
			return current; 
		}
		
		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current; 
		}
		
		current.right = deleteRecursive(current.right, value);
		return current; 
		
	}
	
	public int findSmallestIntValue(Node current) {
		return (current.left == null) ? current.value : findSmallestIntValue(current.left); 
	}
	
	// depth first traversal
	public void inOrderTraversal() {
		inOrderTraversal(root);  
	}
	
	public void inOrderTraversal(Node node) {
		if (node != null) {
			inOrderTraversal(node.left); 
			System.out.print(" " + node.value);
			inOrderTraversal(node.right); 
		}
	}
	
	public void preOrderTraversal() {
		preOrderTraversal(root); 
	}
	
	public void preOrderTraversal(Node node) {
		if (node != null) {
			System.out.print(" " + node.value);
			preOrderTraversal(node.left); 
			preOrderTraversal(node.right); 
		}
	}

	public void postOrderTraversal() {
		postOrderTraversal(root); 
	}
	
	public void postOrderTraversal(Node node) {
		if (node != null) {
			postOrderTraversal(node.left); 
			postOrderTraversal(node.right); 
			System.out.print(" " + node.value);
		}
	}
	
	// breadth first traversal
	public void levelOrderTraversal() {
		if (root == null) {
			return; 
		}
		
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		
		while (!nodes.isEmpty()) {
			Node node = nodes.remove(); 
			
			System.out.print(" " + node.value);
			
			if (node.left != null) {
				nodes.add(node.left); 
			}
			
			if (node.right != null) {
				nodes.add(node.right); 
			}
		}
	}
	
	public int minValue() {
		return minValue(root); 
	}
	
	public int minValue(Node current) {
		
		while (current.left != null) {
			current = current.left; 
		}
		return current.value; 
	}
	
	public int maxValue() {
		return maxValue(root); 
	}
	
	public int maxValue(Node current) {
		
		while (current.right != null) {
			current = current.right; 
		}
		return current.value; 
	}
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree(); 
		
		bt.add(6); 
		bt.add(4); 
		bt.add(8); 
		bt.add(3); 
		bt.add(5);
		bt.add(7); 
		bt.add(9); 
		
		System.out.println("InOrder Traversal: ");
		bt.inOrderTraversal();
		System.out.println("\nPreOrder Traversal: ");
		bt.preOrderTraversal();
		System.out.println("\nPostOrder Traversal: ");
		bt.postOrderTraversal();
		System.out.println("\nLevelOrder Traversal: ");
		bt.levelOrderTraversal();
		System.out.println("");
				
		boolean exists = bt.search(9);
		System.out.println("\nSearched Node 9 exists? " + exists);
		
		exists = bt.search(10);
		System.out.println("\nSearched Node 10 exists? " + exists);
		
		int btSize = bt.getSize(); 
		System.out.println("Binary Tree size is: " + btSize);
		
		int minValue = bt.minValue(); 
		System.out.println("Minimum value in the BT: " + minValue);
		
		int maxValue = bt.maxValue(); 
		System.out.println("Maximum value in the BT: " + maxValue);
		
		Node deletedNode = bt.delete(3); 
		System.out.println("ReplacedNode: " + deletedNode.value);
		
		System.out.println("InOrder Traversal: ");
		bt.inOrderTraversal();
		System.out.println("\nPreOrder Traversal: ");
		bt.preOrderTraversal();
		System.out.println("\nPostOrder Traversal: ");
		bt.postOrderTraversal();
		System.out.println("\nLevelOrder Traversal: ");
		bt.levelOrderTraversal();
		System.out.println("");
	}

}
