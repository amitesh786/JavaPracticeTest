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
class exe26 {

    // Driver method 
    public static void main(String[] args) {

        out.println("Insertion Sort using Java");

        int[] arr1 = {10,34,2,56,7,67,88,42};

        Scanner input = new Scanner(System.in);
        out.println("Enter the size of an Array");

        int num = input.nextInt();
        out.println("Enter the Element "+num+" of an Array");

        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            out.println("Please enter number");
            numbers[i] = input.nextInt();
        }

        int[] arr2 = doInsertionSort(numbers);

        for(int j=0; j< arr2.length; j++){
            out.print(arr2[j] + " "); 
        }
        out.println();
    }
     
    public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {

            for(int j = i ; j > 0 ; j--){

                if(input[j] < input[j-1]){

                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;

                }
            }
        }
        return input;
    }

}
