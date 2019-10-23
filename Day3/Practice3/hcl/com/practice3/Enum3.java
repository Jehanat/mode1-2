package hcl.com.practice3;
enum Student{Jenny,Shrey,Binny,Mona,Sharry}
public class Enum3 {
	public static void show(){
		Student[] arrStudent=Student.values();
		for(Student student:arrStudent){
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		show();
	}

}
