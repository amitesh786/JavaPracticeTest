import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe10 {

	public static void main (String[] args) throws java.lang.Exception {
       
        Scanner test = new Scanner(System.in);

        out.println("Enter string : ");

        String str = test.nextLine();

        count(str);
	}

    public static void count(String x) {

        char[] ch = x.toCharArray();
        
        out.println(ch);

        int letter = 0;
        int space = 0;
		int num = 0;
		int other = 0;

		for(int i = 0; i < x.length(); i++) {

			if(Character.isLetter(ch[i])) {
				letter ++ ;
			} else if(Character.isDigit(ch[i])) {
				num ++ ;
			} else if(Character.isSpaceChar(ch[i])) {
				space ++ ;
			} else {
				other ++;
			}
		}

		out.println("The string is : " + x);
		out.println("letter: " + letter + "\n" + "space: " + space + "\n" + "number: " + num + "\n" + "other: " + other);
    }
}
