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

class exe37 {
    public static void main(String[] args) {

        int[] arr = {11, 1, 13, 10, 15, 40, 30, 33, 44};
        out.println("Enter the array: " + Arrays.toString(arr));
        int indexOfArr = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 30) {
                indexOfArr = i;
                out.println("Enter the array: " + indexOfArr);
                int remaining = arr.length - indexOfArr;
                Integer[] storeArr = new Integer[remaining - 1];
                for(int j=indexOfArr + 1; j< arr.length; j++) {
                    storeArr[j - i] = arr[j];
                }
                out.println("Enter the array: " + Arrays.toString(storeArr));
                break;
            }
        }
	}
}
