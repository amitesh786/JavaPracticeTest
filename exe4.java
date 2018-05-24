import java.util.*;
import java.lang.*;
import java.io.*;

class exe4 {

	public static void main (String[] args) throws java.lang.Exception {
       
    Scanner test = new Scanner(System.in);

    System.out.println("Enter input: ");
    int input1 = test.nextInt();
    System.out.println("Enter input: ");
    int input2 = test.nextInt();
    int input3;

    // input3 = input1;
    // input1 = input2;
    // input2 = input3;

    input1 = input1 + input2;
    input2 = input1 - input2;    
    input1 = input1 - input2;

    System.out.println("Output: " + input1 + " and " + input2 + "\n");

	}
}