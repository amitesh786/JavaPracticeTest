import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe23 {

	public static void main (String[] args) throws java.lang.Exception {
        
        Scanner input = new Scanner(System.in);
        String test = input.nextLine();

        out.println("Enter input number: " + test);
        int test1 = Integer.parseInt(test);
        
        int result = 0;
        if(test1 % 2 == 0) {
            result = 1;
            out.println("Number is even: "+ result);
        } else {
            result = 0;
            out.println("Number is odd: "+ result); 
        }
    }
}
