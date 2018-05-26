package week1day1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber=121;
		int reversenumber=0;
		int copyofinputNumber=inputNumber;
		while(inputNumber!=0)
		{
			int quotient=inputNumber/10;
			int remainder=inputNumber%10;
			reversenumber=reversenumber*10+remainder;
			inputNumber=quotient;
		}
			if(reversenumber==copyofinputNumber)
		{
				System.out.println("Given number is palindrome number" );
		}
			else 
		{
				System.out.println("Given number is not a palindrome number");
		}
}
}

	


