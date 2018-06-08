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

// Array first and last number should be equal
class exe38 {
    public static void main(String[] args) {
        int[] arr = {11, 1, 13, 10, 15, 40, 30, 33, 112, 11};
        out.println("Enter the array: " + Arrays.toString(arr));
        int result = 1;
        int first, last;
        if(arr.length != 0) {
            first = arr[0];
            last = arr[arr.length - 1];
            out.println("First: " + first);
            out.println("Last: " + last);
            if(first == last) {
                result = 0;
            }
        }
        if(result == 0) {
            out.println("Array: " + "true");
        } else {
            out.println("Array: " + "false");
        }
	}
}
