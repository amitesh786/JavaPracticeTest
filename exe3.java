import java.util.*;
import java.lang.*;
import java.io.*;

class exe3 {

	public static void main (String[] args) throws java.lang.Exception {
        // Scanner test = new Scanner(System.in);

        // System.out.println("Input first number: ");
        // int input1 = test.nextInt();

        // System.out.println("Input second number: ");
        // int input2 = test.nextInt();

        // System.out.println("Average: " + (input1 + input2)/2 );

        double num = 0;
        double x = 1;


        Scanner test = new Scanner(System.in);
        int n = test.nextInt();

        while (x <= n) {
            System.out.println("Input number " + "("+ (int) x +")" + ":");
            num += test.nextInt();
            x += 1;
        }
        double avgn = (num / n);

        System.out.println("Average:" + avgn);

	}
}