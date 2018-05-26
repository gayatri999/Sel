package week1day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int inputNumber=1234;
		int sumofdigits=0;
		int copyofinputNumber=inputNumber;
		while(inputNumber!=0)
		{
			int quotient=inputNumber/10;
			int remainder=inputNumber%10;
			sumofdigits=sumofdigits+remainder;
			inputNumber=quotient;
		}
		System.out.println("sumofdigits "  +  copyofinputNumber  + sumofdigits );
		}
}



