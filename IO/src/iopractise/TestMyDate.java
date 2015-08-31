package iopractise;

class MyDate{
	private int date,month,year;
	 public MyDate(int date,int month,int year){
		 
		         this.date=date;
				 this.month=month;
				 this.year=year;
	 }
	 public MyDate addDays(int days)
	 {   int newDays;
		 newDays=date+days;
		
		 MyDate date1=new MyDate(newDays,month,year);
		 return date1;
		 
	 }
	 public String toString()
	 {
		
			 
		return date+"-"+month+"-"+year;
		 
		 
	 }
}

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyDate my_birth=new MyDate(22,7,1964);
         MyDate the_next_week=my_birth.addDays(7);
         System.out.println(my_birth.toString());
         System.out.println(the_next_week.toString());
	}

}
