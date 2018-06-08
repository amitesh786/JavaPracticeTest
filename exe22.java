import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe22 {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();   
        int result = 0; 
        char[] ch = word.toCharArray();
        for (int i = 0; i< 100; i++) {
            if(i%3 != 0 ) {
                out.println(i);
                result += i;
            } else if(i%2 != 0 ) {
                out.println(i);
                result += i;
            }
        }
        out.println("Number: "+ result); 
    }
}
