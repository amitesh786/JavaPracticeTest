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

class exe29 {
    // Driver method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String test1 = input.nextLine();
        out.println("Enter the string: " + test1);
        
        char[] stringToCharArray1 = test1.toCharArray();
        int stringLength1 = stringToCharArray1.length;

        for (int i=1; i< stringLength1; i++) {
            out.println(stringToCharArray1[i]);
        }
    }
}
