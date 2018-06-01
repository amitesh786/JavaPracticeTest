import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe21 {

	public static void main (String[] args) throws java.lang.Exception {        
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word = word.trim();
        String result = ""; 
        char[] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        out.println("Reverse word: "+ result.trim() ); 
    }
}
