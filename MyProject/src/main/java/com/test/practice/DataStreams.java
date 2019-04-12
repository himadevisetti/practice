package com.test.practice;

import java.io.*;
public class DataStreams {

   public static void main(String args[])throws IOException {

      // writing string to a file encoded as modified UTF-8
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("resources/file.txt"));
      dataOut.writeUTF("hello");
      dataOut.close();

      // Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("resources/file.txt"));

      while(dataIn.available()>0) {
         String k = dataIn.readUTF();
         System.out.print(k+" ");
      }
      dataIn.close();
   }
}
