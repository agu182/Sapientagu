package arithmetic;



public class Copy {

	public static void main(String[] args) {
		int[][][] src=new int[5][3][2];
		int[][][] dest=new int[5][3][2];
		src[0][1][1]=1;
		src[4][2][1]=10;

  System.arraycopy(src, 0, dest, 0, 3);
  for(int[][] dim1:dest)
  {
	  for(int[] dim2:dim1){
		  for(int value:dim2){
	  
	  System.out.println(value);
  }
	}}}

}
