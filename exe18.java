import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe18 {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = in.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
    }
    public static boolean checkNum(int a, int b, int c) {
        return ( (a+b) == c );
    }
}
