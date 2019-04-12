package com.test.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellChecker {

	String filePath = "resources/words.txt"; 
	private Dictionary dict; 
	final static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
	
	public SpellChecker() {
		dict = new Dictionary(); 
		dict.build(filePath);
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in); 
		String input; 
		
		while (true) {
			System.out.println("Enter the word you want to search: \n");
			input = sc.nextLine(); 
			
			if (input.equals("")) {
				System.out.println("Nothing was entered");
				break; 
			} else if (dict.contains(input)) {
				System.out.println("Word " + input + " has been spelt correctly");
			} else {
				System.out.println("Word has not been spelt correctly");
				System.out.println(printSuggestions(input));
			}
		}
		sc.close();
	}
	
	public String printSuggestions(String input) {
		ArrayList<String> suggestions = makeSuggestions(input); 
		StringBuilder sb = new StringBuilder(); 
		if (suggestions.size() == 0) {
			return "No idea what you meant";
		}
		System.out.println("This is probably what you meant: \n");
		for (String str: suggestions) {
			sb.append(str); 
		}
		
		return sb.toString(); 
	}
	
	public ArrayList<String> makeSuggestions(String input) {
		ArrayList<String> toReturn = new ArrayList<>(); 
		toReturn.addAll(charAppended(input)); 
		return toReturn; 
	}

	public ArrayList<String> charAppended(String input) {
		ArrayList<String> toReturn = new ArrayList<>();
		
		for (char c: alphabet) {
			String frontEnd = c + input; 
			String backEnd = input + c; 
			
			if (dict.contains(frontEnd)) {
				toReturn.add(frontEnd); 
			}
			if (dict.contains(backEnd)) {
				toReturn.add(backEnd); 
			}
		}
		
		return toReturn; 
	}
	
	
	class Dictionary {
		
		private int M = 1319; 
		final private Bucket[] array; 
		
		public Dictionary() {
			array = new Bucket[M]; 
			for (int i=0; i<M; i++) {
				array[i] = new Bucket(); 
			}		
		}
		
		public int hash(String key) {
			return (key.hashCode() & 0x7fffffff) % M; 			
		}
		
		public void add(String key) {
			array[hash(key)].put(key); 
		}
		
		public boolean contains(String input) {
			input = input.toLowerCase(); 
			return array[hash(input)].get(input); 
		}
		
		public void build(String filePath) {
			try { 
				BufferedReader br = new BufferedReader(new FileReader(filePath));
				String line; 
				while ((line = br.readLine()) != null) {
					add(line);
				}
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace(); 
			}
		}
		
	}
	
	class Bucket {
		
		private Node first; 
		
		public boolean get(String key) {
			Node next = first; 
			
			while (next != null) {
				if (next.word.equals(key)) {
					return true; 
				}
				next = next.next; 
			}
			return false; 
		}
		
		public void put(String key) {
			for (Node curr = first; curr != null; curr = curr.next) {
				if (curr.word.equals(key)) {
					return; 
				} 
			}
			first = new Node(key, first);
		}
		
	}
	
	class Node {
		
		String word; 
		Node next; 
		
		public Node(String key, Node next) {
			this.word = key; 
			this.next = next; 
		}
		
	}
	
	public static void main(String[] args) {
		
		SpellChecker sc = new SpellChecker(); 
		sc.run(); 

	}

}
