package mainpackthread;

public class MainApp {

	public static void main(String[] args)
	{
		
		Thread mainThread=Thread.currentThread();
		System.out.println(mainThread);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the end");
	}
}
