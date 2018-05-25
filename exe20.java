import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe20 {

	public static void main (String[] args) throws java.lang.Exception {
        
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String a = capitalizeString(str);
        out.println(a);

    }

    public static String capitalizeString(String str) {

        String[] words = str.split("[ ]+");        

        return String.valueOf(words[words.length - 2]);

    }

}
