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
class exe25 {
    /*Function to sort array using insertion sort*/
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
 
    /* A utility function to print array of size n*/
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 112, 11};
        Scanner R = new Scanner(System.in);
        int arraySize = Integer.parseInt(R.nextLine());
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = Integer.parseInt(R.nextLine());
            out.println(inputArray[i] + "\n");
        }
        exe25 ob = new exe25();
        ob.sort(arr);
        printArray(arr);
    }
}
