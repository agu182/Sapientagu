package com.sapient;
 
class IllegalAgeException extends Exception{
	public String getMessage()
	{
		
		return( "you are not eligible to register");
	}
	
	
} 
class Vote{
	
	public void register (int age) throws IllegalAgeException{
		
		if(age<18)
		{
			throw new IllegalAgeException();
		}
			System.out.println("you are eligible to register for vote");
		
	}
}
public class MainThrow {

	public static void main(String[] args) {
	
	Vote vote=new Vote();
	try{
	
	vote.register(13);
	}
	catch(IllegalAgeException e)
	{
		System.out.println(e.getMessage());
	}
	}

}
