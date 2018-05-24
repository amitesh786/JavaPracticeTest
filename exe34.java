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

// Java program for implementation array
class exe34 {

    // Driver method
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // Integer arr = input.nextInt();

        int[] arr = { 10, 20, 31, 41};
        int sumEven = 0, sumOdd = 0;

        out.println("Original Array: "+Arrays.toString(arr));

        for (int i=0; i<arr.length; i++) {
            
            if (arr[i] %2 1= 0) {
                int temp = arr[i];
                arr[i] = 
                sumOdd +=1;
            }
            // else {
            //     sumEven +=1;
            // }
        }

        out.println("Output : " + " \n Number Even - " + sumEven + " \n Number Odd - " + sumOdd );        
        
	}
}
