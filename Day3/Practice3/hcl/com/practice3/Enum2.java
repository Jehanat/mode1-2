package hcl.com.practice3;
enum DayName{MONDAY,TUESDAY,WEDNESDAY}

public class Enum2 {
	 
		DayName day;
		public Enum2(DayName day){
			this.day=day;
			
	}
		public static void main(String[] args) {
			String day="WEDNESDAY";
			Enum2 obj=new Enum2(DayName.valueOf(day));
			System.out.println(day);
		}
		
	}

