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

class exe30 {
    // Driver method
    public static void main(String[] args) {
        int[] arr = {200, 130, 40};
        out.print("Enter the string: ");
        for (int i=0; i< arr.length; i++) {
            out.print(arr[i] + ", ");
        }
        out.println(" ");
        int temp = arr[0];
        for (int i=0; i< arr.length; i++) {
            if(temp < arr[i]) {
                temp = arr[i];
            }
        }
        out.println("Largest Num: " + temp);
    }
}
