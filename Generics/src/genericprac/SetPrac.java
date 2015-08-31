package genericprac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class Data
{ 
	private int value;
	 public Data(int value)
	 {
		 
		 this.value=value;
	 }
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(value);
	}
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Data) {
            Data dd = (Data) obj;
          if(dd.getValue()==this.value){
        	  return true;
          }
            
         else {
            return false;
        }
		} else{
        	  
        	  return false;
          }

	}
}

 class SetPrac {
     public static void main( String[] args) {
	Set<Data> result=new HashSet<Data>();
	result.add(new Data(4));
	result.add(new Data(3));
	result.add(new Data(2));
	result.add(new Data(4));
	result.add(new Data(6));
	Iterator<Data> iterator=result.iterator();
	Data name;
	while(iterator.hasNext())
	{
		name=iterator.next();
		System.out.println(name);
	}
	}

}
