package genericprac;

class Data1<T>{
	 private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	 
	
}
public class GenericPractise {
	public static void main(String args[]){
	Data1<Integer> d=new Data1<Integer>();
	d.setValue(12);
	System.out.println(d.getValue());
	
	
	
}

}
