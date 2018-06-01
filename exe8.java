import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe8 {

	public static void main (String[] args) throws java.lang.Exception {
       
        Scanner test = new Scanner(System.in);

        out.println("Enter first number: ");
        long input1 = test.nextLong();
        long sum = 0;
        while (input1 != 0) {
            sum += input1 % 10;
            input1 /=10;
        }
        out.println("Output: " + sum);
	}
}
