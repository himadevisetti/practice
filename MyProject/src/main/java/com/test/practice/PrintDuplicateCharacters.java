package com.test.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacters {

	public static void printDuplicateCharacters(String word) {
		
		char[] characters = word.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>(); 
		for (char ch: characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1); 
			} else {
				charMap.put(ch, 1); 
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("Print duplicates in '%s' %n", word);
		for (Map.Entry<Character, Integer> entry: entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		printDuplicateCharacters("Java");
		printDuplicateCharacters("Programming");

	}

}
