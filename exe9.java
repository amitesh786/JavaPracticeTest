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
        // String str = test.next();

        // String str1 = new StringBuilder(str).reverse().toString();

        // out.println("Reverse string : " + str1);

        // int i, len = str.length();
        // StringBuilder dest = new StringBuilder(len);

        // for (i = (len - 1); i >= 0; i--){
        //     dest.append(str.charAt(i));
        // }
        
        // out.println("Reverse string : " + dest.toString());

        char[] letters = test.nextLine().toCharArray();

        out.print("Reverse string: ");

        for (int i=letters.length - 1; i >= 0; i--) {

            out.print(letters[i]);
        }
        out.print("\n");


	}
}
