import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe9 {

	public static void main (String[] args) throws java.lang.Exception {
       
        Scanner test = new Scanner(System.in);

        out.println("Enter string : ");

        char[] letters = test.nextLine().toCharArray();

        out.print("Reverse string: ");

        for (int i=letters.length - 1; i >= 0; i--) {

            out.print(letters[i]);
        }
        out.print("\n");


	}
}
