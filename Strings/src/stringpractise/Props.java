package stringpractise;

import java.util.Enumeration;
import java.util.Properties;


public class Props {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Properties prop= System.getProperties();
      Enumeration keys= prop.keys();
      String key;
      while(keys.hasMoreElements()){
    	  key=(String)keys.nextElement();
    	  System.err.println(key+" : "+prop.get(key));
    	  
      }
      System.out.println(System.getProperty("os.name"));
	}

}
