import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

class exe41 {
    public static void main(String[] args) {

        int n = 895;
        int sum = 0;

        while(n > 0) {
            sum = sum + (n%10);
            n = n/10;
        }

        if(sum >= 10) {
            n = sum;
            sum = 0;
            while(n > 0) {
                sum = sum + (n%10);
                n = n/10;
            }
        }
        out.println("Add: " + sum);
        
	}
}
