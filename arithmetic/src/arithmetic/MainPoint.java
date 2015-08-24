package arithmetic;
class Point{
	int i,j;
	Point()
	{
		
	}
	Point(int x,int y)
	{
		
		i=x;
		j=y;
	}
	
}
class Point2{
	
	public  Point[] createArray(){
		  Point[] p;
	      p=new Point[10];
	      for(int i=0;i<10;i++)
	      {
	    	 p[i]=new Point(i,i+1); 
	    	  
	      }
	      return p;
	}
}

public class MainPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Point[] p1;
		Point2 p2=new Point2();
   
        p1=p2.createArray();
        for(Point ref:p1)
        {
        	System.out.print(ref.i+" ");
        	System.out.println(ref.j);
        }
  
      
	}

}
