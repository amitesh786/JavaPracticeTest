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

public class exe24 {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(R.readLine());
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = Integer.parseInt(R.readLine());
        }
        mergeSort(inputArray);
        out.println(inputArray);
        for (int j = 0; j < inputArray.length; j++) {
            out.println(inputArray[j]);
        }
    }

    public static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length/2;
            int[] leftArray = Arrays.copyOfRange(A, 0, q-1);
            int[] rightArray = Arrays.copyOfRange(A, q, A.length-1);
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(A, leftArray, rightArray);
        }
    }

    public static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri < r.length)) {
                if (l[li] < r[ri]) { a[i] = l[li]; i++; li++; }
                else { a[i] = r[ri]; i++; ri++; }
            } else {
                if (li >= l.length) {
                    while (ri < r.length) { a[i] = r[ri]; i++; ri++; }
                }
                if (ri >= r.length) {
                    while (li < l.length) { a[i] = l[li]; li++; i++; }
                }
            }
        }
    }
}
