import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;

class exe17 {
        public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
        }

        public static void main(String[] args) {
            int n = 10;
            for (int i = 1; i <= n; i++)
                out.println(i + ": " + fibonacci(i));
        }
    
}
