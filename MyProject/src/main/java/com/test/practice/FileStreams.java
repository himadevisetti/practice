package com.test.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreams {

	public static void main(String[] args) {
		
		try {
			byte bWrite [] = {11,21,3,40,5}; 
			OutputStream os = new FileOutputStream("resources/streamtest.txt"); 
			
			for (int i=0; i<bWrite.length; i++) {
				os.write(bWrite[i]);
			}
			os.close(); 
			
			InputStream is = new FileInputStream("resources/streamtest.txt");
			int size = is.available();
			
			for (int j=0; j<size; j++) {
				System.out.print((char)is.read() + " "); 
			}
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
