package week1;

public class LogocialOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//conditional/Logical operators
        boolean h = true;
        boolean l = false;

        System.out.println("h && l = " + (h&&l));
        System.out.println("h || l = " + (h||l) );
        System.out.println("!(h && l) = " + !(h && l));
 //post/pre(increment&decrement) operators
      	int num1 = 1;//(post increment)
        int num2 = 1;

        num1++;
        num2++;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int num3 = 2;//(pre decrement)
        int num4 = 2;

        --num3;
        --num4;

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        int num5 = 2;//(post decrement)
        int num6 = 2;

        num5--;
        num6--;

        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        int num7 = 1;//(pre increment)
        int num8 = 1;

        ++num7;
        ++num8;

        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
        
 
	}

}
