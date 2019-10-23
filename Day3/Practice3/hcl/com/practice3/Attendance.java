package hcl.com.practice3;

public class Attendance {
	public static void display(Object...ob){
		for(Object object : ob)
		{
			System.out.println(object + " ");
		}
	}
	public static void show(int day,String...name){
		
		for(String s : name){
			System.out.println(day + " ");
			System.out.print(s + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		show(1);
		show(2,"Jenny","Shrey");
		show(3,"Jenny","Shrey","Sharry");
		show(4,"Sharry","Mona");
		display();
		display("Sita",11,14.43,true);


}}
