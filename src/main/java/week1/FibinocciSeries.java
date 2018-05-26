package week1;

import java.util.Scanner;

public class FibinocciSeries {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n1=0,n2=1,i;
		Scanner fib =new Scanner(System.in);
		System.out.println("Enter the inputNumber is:");
		int n3=fib.nextInt();
		int n4=n3;
		System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=0;i<=n4;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.println("Fibonocci series is: "+n3);    
		  n1=n2;    
		  n2=n3; 
		  
		 }   
	fib.close();
	}
}
