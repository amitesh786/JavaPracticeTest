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

class exe28 {
    // Driver method
    public static void main(String[] args) {
        out.println("Quick Sort using Java");
        Scanner input = new Scanner(System.in);
        out.println("Enter the size of an Array");
        int num = input.nextInt();
        out.println("Enter the Element "+num+" of an Array");
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        // Priorty set
        int numPriorty = input.nextInt();
        out.println("Enter the priority of an Array " + numPriorty);
        int[] arr2 = doBubbleSort(numbers, numPriorty)
        // Sorting Done 
        out.println("Sorting completed");
        for(int j=0; j< arr2.length; j++){
            out.print(arr2[j] + " "); 
        }
        out.println();
    }
     
    public static int[] doBubbleSort(int[] input, int numPriorty){
        int temp;
        for (int i = 0; i < input.length; i++) {
            for(int j = 0 ; j < numPriorty; j++){
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
