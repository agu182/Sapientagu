package Inter;

public class Airplane extends Vehicle implements Flyer {

	
	public void takeOff  () {
	System.out.println("ready to take off");
	}


	public void land () {
		
System.out.println("ready to land");
	}


	public void fly () {
		
		System.out.println("ready to fly");

	}

}