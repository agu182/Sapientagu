package mainpack;

  public class  MainApp {
	
	public String pub;
	private String priv;
	protected String prot;
	String def;
	}
  
  class Test 
  {
	  
	  public static void main(String ar[])
	  {
		  MainApp mn=new MainApp();
		  mn.def="hello";
		  mn.pub="you";
		  mn.prot="why";
		  
	  }
  }
  