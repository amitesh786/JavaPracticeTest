import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe16 {

	public static void main (String[] args) throws java.lang.Exception {

        Scanner str = new Scanner(System.in);
        
        String input = str.nextLine();

        out.println("Enter String: " + input);

        String from = str.nextLine();
        out.println("Enter String to from: " + from);
        // char from = 'a';
        String to = str.nextLine();

        out.println("Enter String to to: " + to);
        // char to = 's';

        String repl = replace(input , from, to);
        out.println("New String: " + repl)

	}

    private static String replace(String input, String from, String to) {
        
        StringBuffer result = new StringBuffer(input.length());

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == from.charAt(0)) {
                result.append(to.charAt(0));
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
