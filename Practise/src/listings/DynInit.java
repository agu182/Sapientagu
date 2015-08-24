package listings;

public class DynInit {
	/**Calculating sqrt of sum.*/
	public static void main(String[] args) {
	      double val1 = 3.0, val2= 4.0;
	      
	      // c is dynamically initialized
	      double sqrt = Math.sqrt(val1 * val1 + val2 * val2);

	      System.out.println("Hypotenuse is " + sqrt);
	    }
}
