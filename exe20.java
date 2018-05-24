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

        // System.out.println("Penultimate word: "+words[words.length - 2]);

    }

    public static String capitalizeString(String str) {

        // char[] chars = str.toLowerCase().toCharArray();

        // boolean found = true;

        // for (int i=0; i<chars.length;i++) {

        //     if (found && Character.isLetter(chars[i]) ) {

        //         chars[i] = Character.toUpperCase(chars[i]);
        //         found = false;

        //     } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
        //         found = true;
        //     }
        // }

        // boolean found = true;

        // for (int i=0; i<chars.length;i++) {

        //     if (Character.isLetter(chars[i]) ) {

        //         chars[i] = Character.toLowerCase(chars[i]);
        //     }
        // }

        // char[] chars = str.toLowerCase().toCharArray();

        // String[] words = str[chars.length - 2];
            
        // return String.valueOf(words);

        String[] words = str.split("[ ]+");        

        return String.valueOf(words[words.length - 2]);

    }

}
