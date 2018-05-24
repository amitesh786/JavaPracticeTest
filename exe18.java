import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe18 {

	public static void main (String[] args) throws java.lang.Exception {

        // Scanner str = new Scanner(System.in);
        // String input = str.nextLine();
        // int a = Integer.parseInt(input);
        // out.println(a);

        // StringBuffer input1 = new StringBuffer(20);
        // StringBuffer input2 = new StringBuffer(20);
        // StringBuffer input3 = new StringBuffer(20);

        // for(int i=1; i<100; i++) {
        //     if(i%3 == 0) {
        //         input1.append(i + " ");
        //     }
        //     if (i%5 == 0) {
        //         input2.append(i + " ");
        //     }
        //     if(i%3 == 0 && i%5 == 0) {
        //         input3.append(i + " ");
        //     }
        // }
        // out.println("Divided by 3: " + "\n" + input1 + "\n" + "Divided by 5: " + "\n" + input2 + "\n" + "Divided by 3 & 5: " + "\n" + input3);


        // int a=5, b=10, c=15;

        // checkNum(a, b, c);
        // out.println("The result is: " + checkNum(a, b, c));

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

        // if (sum == c) {
        //     out.println("The result is: " + cond);
        //     return cond;
        // } else{
        //     cond = false;
        //     out.println("The result is: " + cond);
        //     return cond;
        // }
    }
}
