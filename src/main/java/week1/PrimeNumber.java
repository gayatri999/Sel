package week1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
		
		Scanner prime =new Scanner(System.in);
		
		int k=1;
		
		for(int i=2;i<=10;i++)
		{
			System.out.println("Enter the inputNumber  is:");
			
			int n = prime.nextInt();
			
			a=n%2;
			b=n%3;
			c=n%5;
		   if(a==0||b==0||c==0)
		   {
		    System.out.println(n+"is not a prime number"); 
		 }
		
		//If isPrime is true then the number is prime else not
		
		else
		{
		   System.out.println(n + " is  a Prime Number");
	   }
		
		k++;}
		{
		System.out.println("no of inputs "+k);	
	}
	
}

	}

