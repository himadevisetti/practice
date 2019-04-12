package com.test.practice;

import java.io.File;

public class Directories {

	public static void main(String[] args) {
		
		File f = new File("C://Hima/test/dir/new");
		
		System.out.println("Directories were created? " + f.mkdirs()); 
		
		File f2 = new File("C://Hima/test/dir"); 
		String[] dirs = f2.list(); 
		
		for (String dir: dirs) {
			System.out.print(dir + " ");
		}

	}

}
