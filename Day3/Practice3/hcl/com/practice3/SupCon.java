package hcl.com.practice3;

class Employ {
	
	int empno;
	String name;
	double basic;
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	

}
class Amit extends Employ{

	public Amit(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
class Vinod extends Employ{

	public Vinod(int empno, String name, double basic) {
		super(empno, name, basic);
	
	}
	
}
public class SupCon{
	public static void main(String[] args) {
		Employ e1=new Amit(1,"Amit",4567);
		Employ e2=new Vinod(2,"Vinod",7654);
		System.out.println(e1);
		System.out.println(e2);
		Employ[] arrEmploy=new Employ[]{e1,e2};
		for(Employ employ :arrEmploy){
			System.out.println(employ);
		}
		
	}
	
}