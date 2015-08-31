package genericprac;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Write {
public static void main(String[] args)
{
   Address address=new Address();
   address.setCountry("India");
   address.setStreet("Park Street");
   try{
	   FileOutputStream fout=new FileOutputStream("D:\\address.ser");
	   ObjectOutputStream oos=new ObjectOutputStream(fout);
	   oos.writeObject(address);
	   oos.close();
	   System.out.println("Done");
	  }catch(Exception ex)
	  {
		  ex.printStackTrace();
		  
	  }
}
}
