import java.util.*;
import java.lang.*;
import java.io.*;

class exe2 {
    private static final double input1 = 7.5;
	public static void main (String[] args) throws java.lang.Exception {
        Scanner test = new Scanner(System.in);
        System.out.println("Test Data: ");
        System.out.println("Radius:" + " = " + input1);
        double d1 = Math.PI * input1 * input1;
        double d2 = 2 * Math.PI * input1;
        System.out.println("Output: \n");
        System.out.println("Perimeter is = " + d2 + "\n");
        System.out.println("Area is = " + d1);        
	}
}