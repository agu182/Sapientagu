package mainpackthread;
class Data{
	private int value;
	public void setValue(int value)
	{
		this.value=value;
	}
	public void getValue()
	{
		System.out.println(value);
		
	}
	
}
 class Runner implements Runnable{
   Data data;
   Thread secondThread;
    public Runner()
    {
    	data=new Data();
    	
    }
    public void setSecondThread(Thread secondThread)
    {
    	this.secondThread=secondThread;
    	
    }
	@Override
	public void run() {
		Thread currThread=new Thread();
		currThread=Thread.currentThread();
		
		for(int counter=0;counter<10;counter++)
	    {
		if(currThread.getName().equals("Producer"))
		{
			System.out.println(currThread);
			synchronized(data){
			data.setValue(counter+1);
			
				try {
			
				data.notify();
				if(!secondThread.isAlive())
				{
					secondThread.start();
					
				}
				data.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		else if(currThread.getName().equals("Consumer"))
		{
			System.out.print(currThread);
			synchronized(data){
				data.notify();
			
			data.getValue();
			if(counter!=9)
			{
		
				try {
			
				data.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		}
   
	    
    
    	
    	
    }}
 
		
	}}	
	 
	
public class Joining {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
  Runner runner=new Runner();
  Thread firstThread=new Thread(runner,"Producer");
  Thread secondThread=new Thread(runner,"Consumer");
  firstThread.start();
  runner.setSecondThread(secondThread);


  System.out.println("the end");
  }

}
