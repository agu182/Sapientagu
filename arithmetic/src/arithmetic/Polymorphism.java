package arithmetic;

class Employee {

	public void netSalary() {
		System.out.println("Employee's salary");
	}
}

class Intern extends Employee {

	public void netSalary() {
		System.out.println("Intern's salary");
	}
}

class Confirmed extends Employee {

	public void netSalary() {
		System.out.println("confirmed Employee's salary");
	}
	public void display()
	{
		System.out.println("hello");
		
	}
}
class Contract extends Employee {

	public void netSalary() {
		System.out.println("contract Employee's salary");
	}
}

class Hr {

	public Employee recruit(String empType)

	{

		if (empType.equals("I")) {

			return new Intern();
		} else if (empType.equals("C")) {
			return new Confirmed();
		}
		 else if (empType.equals("T")) {
				return new Contract();
		 }
		return null;
	}
}
class Finance{
	public void processSalary(Employee e){
		e.netSalary();
		if(e instanceof Confirmed)
		{
			Confirmed conf=(Confirmed)e;
			conf.display();
		}
		
	}
	
}
class Statistics{
	
	public float average (int... num)
	{
		int sum=0;
		for(int x:num)
		{
			sum+=x;
			
		}
    return((float)sum/num.length);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Statistics st=new Statistics();
		float f=st.average(23,56,87);
		System.out.println(f);
		
		/*Hr h = new Hr();
		Finance f=new Finance();
		Employee e = h.recruit("C");
		if (e != null)
			f.processSalary(e);*/
		

	}

}
