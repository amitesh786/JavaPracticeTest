import java.util.*;
import java.lang.*;
import java.io.*;

class exe3 {

	public static void main (String[] args) throws java.lang.Exception {
        
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