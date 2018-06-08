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

// Array should be true
class exe39 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 40, 30, 33, 112, 11};
        out.println("Enter the array: " + Arrays.toString(arr));
        int result = 1;
        int[] strArr = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            strArr[i] = arr[i];
            for(int j=1; j<i; j++) {
                strArr[i] = strArr[i] + 1;
                if(strArr[i] == strArr[j]){
                    result = 0;
                }
            }
        }
        if(result == 0) {
            out.println("Array: " + "true");
        } else {
            out.println("Array: " + "false");
        }
	}
}
