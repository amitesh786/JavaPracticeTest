import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

// Java program for implementation of Insertion Sort
class exe32 {

    // Driver method
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // out.print("Enter the number: ");
        // Integer inputInt = input.nextInt();
        // out.println(inputInt);
        // int sum = 0;

        // while(inputInt != 1){

        //     if(inputInt%2 == 0) {
        //         inputInt = inputInt/2;
        //         sum += 1;
        //     } else {
        //         inputInt += inputInt*3 + 1;
        //         sum += 1;
        //     }
        // }
        // out.println("Output: " + sum);

    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //     try {
    //         int sum =0;
    //         String str = br.readLine();
    //         char[] numStr = str.toCharArray();

    //         for(int i=0; i< numStr.length; i++) {
    //             sum += numStr[i] - '0';
    //         }

    //         out.println("Original Number: " + str);
    //         print_number(sum);

    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }        
    // }

    // public static void print_number(int n) {

	// 	int x; int y; int z;
	// 	String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	// 	System.out.println("Sum of the digits of the said number: "+n);
	// 	if (n < 10) {
	// 		System.out.println(number[n]);
	// 	}
	// 	else if (n < 100) {
	// 		x = n / 10;
	// 		y = n - x *10;
	// 		System.out.println("In English: "+number[x] + " " + number[y]);
	// 	} else {
	// 		x = n / 100;
	// 		y = (n - x * 100) / 10;
	// 		z = n - x * 100 - y * 10;
	// 		System.out.println("In English: "+number[x] + " " + number[y] + " " + number[z]);
	// 	}	
        out.println(System.getSecurityManager());

        out.println("\nCurrent system environment:");
        out.println(System.getenv());	 
        out.println("\n\nCurrent system properties:");
        out.println(System.getProperties());

        // gets the value of the specified environment variable "PATH"
        out.println("\nEnvironment variable PATH: ");
        out.println(System.getenv("PATH"));

        // gets the value of the specified environment variable "TEMP"
        out.println("\nEnvironment variable TEMP: ");
        out.println(System.getenv("TEMP"));

        // gets the value of the specified environment variable "USERNAME"
        out.println("\nEnvironment variable USERNAME: ");
        out.println(System.getenv("USERNAME"));

	}

}
