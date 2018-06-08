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

// Array to String to display
class exe35 {
    public static void main(String[] args) {
        int n = 5;
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = String.valueOf(i);
        }
        out.println("String: " + Arrays.toString(arr));
	}
}
