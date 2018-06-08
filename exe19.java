import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe19 {
	public static void main (String[] args) throws java.lang.Exception {
        int a = 5, b = 20, c = 3, counter = 0;
        for(int i=1; i<=25; i++) {
            if(25%i == 0) {
                counter++;
            }
        }
        out.println(counter);
    }
}
