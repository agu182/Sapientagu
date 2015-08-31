package genericprac;
import java.util.*;

public class OldStyle {  
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) { 
	
		ArrayList list = new ArrayList(); 
	 
	    
	    list.add("one"); 
	    list.add("two"); 
	    list.add(3); 
	    list.add("four"); 
	 
	 
		Iterator itr = list.iterator(); 
	    while(itr.hasNext()) { 
	 
//	      if(itr.next() instanceof String)
//	      { 
//	    	  String str =(String) itr.next(); 
//		      System.out.println(str + " is " + str.length() + " chars long."); 
//	      }
//	      else
//	      {
//	      String str = itr.next().toString(); 
//	      System.out.println(str + " is " + str.length() + " chars long."); 
//	    } 
	    	 String str =(String) itr.next().toString(); 
      System.out.println(str + " is " + str.length() + " chars long."); 
	  }  
	  }
	  }