package com.test.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams { 
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null; 
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("resources/input.txt");
			fos = new FileOutputStream("resources/output.txt"); 
			int c; 
			
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
		} finally {
			if (fis != null) {
				fis.close();
			} 
			if (fos != null) {
				fos.close();
			}
		}

	}

}
