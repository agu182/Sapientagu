package genericprac;
import java.util.*;
public class NewStyle {  
	  public static void main(String args[]) { 
		  
		    // Now, list holds references of type String. 
		    ArrayList<String> list = new ArrayList(); 
		 
		    list.add("one"); 
		    list.add("two"); 
		    list.add("3"); 
		    list.add("four"); 
		 
		    // Notice that Iterator is also generic. 
		    Iterator<String> itr = list.iterator(); 
		 
		    while(itr.hasNext()) { 
		      String str =(String) itr.next(); 
		 
		      System.out.println(str + " is " + str.length() + " chars long."); 
		    } 
		  }  
		}