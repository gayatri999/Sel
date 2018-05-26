package week1day1;

public class Operators {

	public static void main(String[] args) {
//Arthimetic operators
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
        System.out.println("Variable values...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    x = " + x);
        System.out.println("    y = " + y);

        //adding numbers
        System.out.println("Adding...");
        System.out.println("    i + j = " + (i + j));
        System.out.println("    x + y = " + (x + y));

        //subtracting numbers
        System.out.println("Subtracting...");
        System.out.println("    i - j = " + (i - j));
        System.out.println("    x - y = " + (x - y));

        //multiplying numbers
        System.out.println("Multiplying...");
        System.out.println("    i * j = " + (i * j));
        System.out.println("    x * y = " + (x * y));

        //dividing numbers
        System.out.println("Dividing...");
        System.out.println("    i / j = " + (i / j));
        System.out.println("    x / y = " + (x / y));

        //computing the remainder resulting from dividing numbers
        System.out.println("Computing the remainder...");
        System.out.println("    i % j = " + (i % j));
        System.out.println("    x % y = " + (x % y));
 //Assignment operators
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );

        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );

        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c &= a ;
        System.out.println("c &= a  = " + c );

        c ^= a ;
        System.out.println("c ^= a   = " + c );

        c |= a ;
        System.out.println("c |= a   = " + c );
 //comparision  operators
        int f=10;
        int g=20;
        System.out.println((f>g));
        System.out.println((f>=g));
        System.out.println((f==g));
        System.out.println((f<g));
        System.out.println((f<=g));
        System.out.println((f!=g));
 //conditional/Logical operators
        boolean h = true;
        boolean l = false;

        System.out.println("h && l = " + (h&&l));
        System.out.println("h || l = " + (h||l) );
        System.out.println("!(h && l) = " + !(h && l));
 //shorthand operators
        int z;
        
      	 z = 7;
      	 z += 4;
      	 System.out.println(z);
       
      	 z = 7;
      	 z -= 4;
      	 System.out.println(z);
       
      	 z = 7;
      	 z*= 4;
      	 System.out.println(z);
       
      	 z = 7;
      	 z /= 4;
      	 System.out.println(z);
       
      	 z = 7;
      	 z %= 4;
      	 System.out.println(z);
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
