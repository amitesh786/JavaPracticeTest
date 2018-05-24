import java.util.*;
import java.lang.*;
import java.io.*;

class exe1 {

	public static void main (String[] args) throws java.lang.Exception {
        
        // System.out.println("Hello \nAmitesh");
        // int test1 = (-5 + 8 * 6);
        // int test2 = ((55+9) % 9);
        // int test3 = (20 + -3*5 / 8);
        // int test4 = (5 + 15 / 3 * 2 - 8 % 3);
        // System.out.println("Test Data : \n-5 + 8 * 6" + "\nExpected Output :\n" + test1 + "\n" + test2 + "\n" + test3 + "\n" + test4 );
        Scanner test = new Scanner(System.in);

        System.out.println("Test Data: ");
        System.out.println("Input first number: ");
        int input1 = test.nextInt();

        System.out.println("Input second number: ");
        int input2 = test.nextInt();

        int add = input1 + input2;
        int sub = input1 - input2;
        int mul = input1 * input2;
        int div = input1 / input2;
        int mod = input1 % input2;

        System.out.println("Output Add: " + add);
        System.out.println("Output Sub: " + sub);
        System.out.println("Output Mul: " + mul);
        System.out.println("Output Div: " + div);
        System.out.println("Output Mod: " + mod);

	}
}