package com.hcl.ex;

public class Ex2 {
  /**
  * Business Method.
  * @param args are A.
  */
  public static void main(String[] args) {
    try {
      System.out.println("A");
      throw new NullPointerException();
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (NullPointerException e) {
      throw new NumberFormatException();
    } catch (NumberFormatException e) {
      System.out.println("ReThrown Error");
    }
  }
}
