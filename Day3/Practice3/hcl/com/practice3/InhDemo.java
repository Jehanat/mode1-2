package hcl.com.practice3;

class First {
	public void show(){
		System.out.println("Show Method from first class");
	}

}
class Second extends First{
	public void show(){
	System.out.println("Show Method from Second class");
}
}
public class InhDemo{
	public static void main(String[] args) {
		Second obj=new Second();
		obj.show();
		First obj1=new Second();
		obj1.show();
		Second obj2=(Second) new First();
		obj2.show();
		First obj11=new First();
		Second obj21=new Second();
		First f1=(First)obj21;
		f1.show();
		First f2=(Second)obj21;
		f2.show();
		Second f3=(Second)obj11;
		f3.show();
	}
}