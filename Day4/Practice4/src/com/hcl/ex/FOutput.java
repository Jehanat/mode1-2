package com.hcl.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {
/**
* Business Method.
* @param args arc and tar.
*/
  public static void main(String[] args) {
    FileInputStream src;
    FileOutputStream tar;
    try {
      src = new FileInputStream(
"C:/hcljava/Day4/Practice4/src/com/hcl/ex/Custom.java");
      tar = new FileOutputStream("C:/files/target.txt");
      int ch;
      while ((ch = src.read()) != -1) {
        tar.write((char)ch);
      }
      src.close();
      tar.close();
      System.out.println("File copied");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
