package com.hcl.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
  /**
  * Business method.
  * @param args fin.
  */
  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream(
          "C:/hcljava/Day4/Practice4/src/com/hcl/ex/Custom.java");
      int ch;
      while ((ch = fin.read()) != -1) {
        fin.close();
      }
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
