import java.util.*;
import java.lang.*;
import java.io.*;

class exe1 {

	public static void main (String[] args) throws java.lang.Exception {
        
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