package hcl.com.practice3;
enum Test{
	A,B,C,T,U;
	private Test(){
		System.out.println("HI");
	}
}
public class P34 {
	public static void main(String[] args) {
		Test t=Test.U;
	}

}
