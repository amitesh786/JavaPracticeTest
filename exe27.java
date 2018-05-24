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
class exe27 {

    // Driver method
    public static void main(String[] args) {

        out.println("Bubble Sort using Java");

        Scanner input = new Scanner(System.in);
        out.println("Enter the size of an Array");

        int num = input.nextInt();
        out.println("Enter the Element "+num+" of an Array");

        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            out.println("Please enter number");
            numbers[i] = input.nextInt();
        }

        int[] arr2 = doBubbleSort(numbers);

        for(int j=0; j< arr2.length; j++){
            out.print(arr2[j] + " "); 
        }
        out.println();
    }
     
    public static int[] doBubbleSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {

            for(int j = 0 ; j < (input.length -1); j++){

                if(input[j] > input[j+1]) {
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }

}
