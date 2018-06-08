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

// Array search element is matched or not
class exe36 {
    public static void main(String[] args) {
        int[] arr = {11, 1, 13, 15, 40, 30};
        int result = 1;
        out.println("Enter the array: " + Arrays.toString(arr));
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 10 | arr[i] == 20) {
                result = 0;
            }
        }
        if(result == 0) {
            out.println("String matched: " + String.valueOf(true));
        }else{
            out.println("String not matched: " + String.valueOf(false));
        }
	}
}
