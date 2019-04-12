package com.test.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null; 
		FileWriter fw = null; 

		try {
			fr = new FileReader("resources/input.txt"); 
			fw = new FileWriter("resources/charoutput.txt"); 
			
			int c; 
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
		} finally {
			if (fr != null) {
				fr.close(); 
			}
			if (fw != null) {
				fw.close(); 
			}
		}
		
	}

}
