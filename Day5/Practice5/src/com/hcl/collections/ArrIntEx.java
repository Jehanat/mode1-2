package com.hcl.collections;
import java.util.ArrayList;
import java.util.List;
public class ArrIntEx {
/**
* Business method logics* 
* @param args is sum.*/
  public static void main(String[]args){
  List num = new ArrayList();num.add(new Integer (44));num.add(new Integer(48));num.add(new Integer(66));num.add(new Integer (88));num.add(new Integer(77));num.add(new Integer (56));int sum=0;for(Object ob:num){sum+=(Integer)ob;}
  System.out.println("Sum"+sum);
}

}
