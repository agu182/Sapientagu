package iopractise;
 class Data{
	 private int firstNumber;
	 private int secondNumber;
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public boolean equals (Object obj)
	{
		if(obj==null)
		{
			
			return false;
		}
	else if(obj instanceof Data)
		{
			Data ref=(Data)obj;
			if(firstNumber==ref.getFirstNumber() && secondNumber==ref.getSecondNumber())
			{
				
				return true;
			}
			else 
				{
				return false; 
				}
		}
		
		else 
		{
			return false;
		}
	}
 
 }
public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Data d1=new Data();
  Data d2=new Data();
  d1.setFirstNumber(23);
  d1.setSecondNumber(2);
  d2.setFirstNumber(23);
  d2.setSecondNumber(2);
  System.out.println(d1.equals(d2));
	}

}
