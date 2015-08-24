package arithmetic;
enum Name{
	Aditi(103), Charul(-3), Nihul(23), Siddharth(0), Atul(34),Siddhant(-100);
	private int price;
	Name(int p)
	{
		price=p;
		
	}
	int getPrice(){
		
		return price;
	}
}

public class Enums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Aditi"+" "+Name.Aditi.getPrice());
		for(Name nms:Name.values())
		{
			System.out.println(nms+" "+nms.getPrice());
			
		}
		
	

	}

}
