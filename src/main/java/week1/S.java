package week1;

public class S {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		public static double getAvg(int[][] a)
		{
		   double total = 0;
		   
		   for (int[] colArray : a)
		   {
		       for (int val : colArray)
		       {
		          total = total + val;
		       }
		   }
		   return total / (a.length * a[0].length);
		}
		
		System.out.println("size of an array is"+total);
		}
	
	


