import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe6 {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner test = new Scanner(System.in);
        out.println("Enter first binary number: ");
        int input1 = test.nextInt();
        int decimal1=0,p1=0;        
        while(input1 !=0)
        {
            decimal1 +=((input1 %10)*Math.pow(2,p1));
            input1 /= 10;
            p1++;
        }
        int store1 = decimal1;
        out.println("Enter second binary number: ");
        int input2 = test.nextInt();
        int decimal2=0,p2=0;        
        while(input2 !=0)
        {
            decimal2 +=((input2 %10)*Math.pow(2,p2));
            input2 /= 10;
            p2++;
        }
        int store2 = decimal2;
        int add = store1 + store2;
        int mul = store1 * store2;
        out.println("Output number: " + Integer.toString(add, 2) );
        out.println("Output number: " + Integer.toString(mul, 2) );
	}
}
