package week1day1;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if statement
		int n = 10;
		float n1 = 5.0f, n2 = 4.3f, n3 = 5.3f, largestnumber;
		if(n%2 == 0){

		   System.out.println("This is even number");

		}
//if-else statement
		if(n%2 == 0){

		   System.out.println("This is even number");

		}

		else{
		   System.out.println("This is not even number");

		}
//if-else-if else
		int number = 0;
		 
	      if (number > 0) {
	         System.out.println("Number is positive.");
	      }
	      else if (number < 0) {
	         System.out.println("Number is negative.");
	      }
	      else {
	         System.out.println("Number is 0.");
	      } 
	      
//Nested if
	      

	        if (n1 > n2) {
	            if (n1>n3 ) {
	                largestnumber = n1;
	            } else {
	                largestnumber = n3;
	            }
	        } else {
	            if (n2 > n3) {
	                largestnumber = n2;
	            } else {
	                largestnumber = n3;
	            }
	        }
//switchcase
	        int day = 5;
	        switch (day) {
	           case 1:
	          System.out.println("Monday");
	          break;
	           case 2:
	           System.out.println("Tuesday");
	           break;
	          case 3:
	          System.out.println("Wednesday");
	          break;
	          case 4:
	          System.out.println("Thrusday");
	          break;
	          case 5:
	           System.out.println("Friday");
	           break;
	          case 6:
	           System.out.println("Saturday");
	           break;
	          case 7:
	          System.out.println("Sunday");
	          break;
	          default:
	           System.out.println("Invalid entry");
	           break;
	        }
	


}
}
