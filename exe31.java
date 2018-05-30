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

class exe31 {
    // Driver method
    public static void main(String[] args) {
        int[] arr1 = {20, 30, 40};
        out.print("Enter the array1: ");

        for (int i=0; i< arr1.length; i++) {
            out.print(arr1[i] + ", ");
        }
        out.println(" ");
        int[] arr2 = {20, 30, 40};
        out.print("Enter the array2: ");

        for (int i=0; i< arr2.length; i++) {
            out.print(arr2[i] + ", ");
        }
        
        out.println(" ");
        int temp;
        for (int i=0; i< arr1.length; i++) {
            temp = arr1[i]*arr2[i];
            out.print(temp + ", ");
        }
        out.println(" ");
    }
}
