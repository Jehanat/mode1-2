package com.hcl.collections;
import java.util.ArrayList;
import java.util.List;
public class ArrEmploy {
/**Business Methods.
*Main method.
*The parameters are no,name,basics.
**/
 public static void main(String[]args) {

List lstEmploy = new ArrayList( );
lstEmploy.add(new Employ(1,"Shrey",6543));
lstEmploy.add(new Employ(2,"Jenny",9876));
lstEmploy.add(new Employ(3,"Mona",9965));
lstEmploy.add(new Employ(4,"Sharry",9999));
for (Object ob : lstEmploy) {
Employ e=(Employ)ob;
System.out.println(e);
}
}

}
