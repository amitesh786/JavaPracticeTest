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
class exe29 {

    // Driver method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String test1 = input.nextLine();
        out.println("Enter the string: " + test1);

        // String test2 = input.nextLine();
        // out.println("Enter the string: " + test2);

        // out.println(test1.substring(1, test1.length()) + test2.substring(1, test2.length()));
        
        char[] stringToCharArray1 = test1.toCharArray();
        // char[] stringToCharArray2 = test2.toCharArray();

        int stringLength1 = stringToCharArray1.length;
        // int stringLength2 = stringToCharArray2.length;

        // if (stringLength1 < stringLength2) {
        //     out.println("String first is short: " + test1 + test2 + test1);
        // } else {
        //     out.println("String second is short: " + test2 + test1 + test2);
        // }

        for (int i=1; i< stringLength1; i++) {
            out.println(stringToCharArray1[i]);
        }

        // Integer[] arr = {20, 30, 40};
        // Collections.rotate(Arrays.asList(arr), 2);
        // out.println(Arrays.toString(arr));

        // int[] array1 = {50, -20, 0};
        // int[] array2 = {5, -50, 10};

        // out.println("Array1: "+ Arrays.toString(array1)); 
        // out.println("Array2: "+ Arrays.toString(array2)); 

        // int[] array_new = {array1[0], array2[2]};

        // out.println("New Array: "+Arrays.toString(array_new));



    }
}
