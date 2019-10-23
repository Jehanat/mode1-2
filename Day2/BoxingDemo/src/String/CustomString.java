package String;

public class CustomString {
	static String name;`
	public CustomString(String name){
		this.name=name;
	}
	public int length(){
		char[]arr=name.toCharArray();
		int i=0;
		for(char c:arr){
			i++;
		}
		return i;
	}
	
	public static void main(String[] args) {
		CustomString obj=new CustomString("Jehanat");
		System.out.println(obj.length());
		System.out.println();
		
	}

}
