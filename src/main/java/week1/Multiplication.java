package week1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mul=new Scanner(System.in);

		System.out.println("Enter the number:");

		int inputNumber,i;
		inputNumber=mul.nextInt();//get the input from the user
				for(i=1;i<=10;i++)
				{
				
				System.out.println(i +" * " +inputNumber+ "  =  "  + i*inputNumber );
		                                 mul.close();
				}
	}

}
