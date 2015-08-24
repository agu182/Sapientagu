package arithmetic;




 class ScopeExample {
	 private int i;
  
	public void firstMethod (){
		int i=4,j=5;
		this.i=i+j;
		secondMethod(7);
	}
	public void secondMethod(int i)
	{
		int j=8;
		this.i=i+j;
		
	}

}
 public class TestScoping{
	 public static void main(String ar[] )
	 {
		 ScopeExample sc=new ScopeExample();
		 sc.firstMethod();
		 
	 }
	 
 }


