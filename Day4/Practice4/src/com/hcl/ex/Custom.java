package com.hcl.ex;

public class Custom {
  /**
  * Method for business logic.
  * @param a is integer type passing parameter.
  */
  public void sum(int a,int b)throws NegativeException,NumberZeroException{ 

    int c;
    boolean flag = true;
    if (a < 0 || b < 0) {
      flag = false;
      throw new NegativeException("Negative nos not allowed");
    }
    if (a == 0 || b ==  0) {
      flag = false;
      throw new NumberZeroException("Zero is Invalid");
    }
    if (flag == true) {
      c = a + b;
      System.out.println("Sum is" + c);
    }
  }
  /**
   * Main Method implementation.
   * @param args a and b as parameter.
   */
  
  public static void main(String[] args) {
    int a = 5;
    int b = 6;
    try {
      new Custom().sum(a, b);
    } catch (NegativeException | NumberZeroException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
