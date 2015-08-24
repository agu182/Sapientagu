package arithmetic;
class Process{
	public void display(){
		
		int num[] [][]=new int[5][3][2];
        num[1][1][1]=1;
        for(int[][] dim1:num)
        {
        	
        	for(int[] dim2:dim1)
        	{
        		for(int value:dim2)
        		{
        			System.out.print(value);
        			
        		}
        		System.out.println();
        	}
        	System.out.println();
        	
        }
        
        
       
	}
}
	/*public void display(int[] src)
	{
		for(int data:src)
		{
			
			System.out.println(data);
		}
		
	}
}*/

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process p=new Process();
		
		p.display();

	}
}


