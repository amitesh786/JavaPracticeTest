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

// Java program for implementation of Insertion Sort
class exe33 {
    // Driver method
    public static void main(String[] args) {
        long startTime = System.nanoTime(); 
        out.println ("The first 10 natural numbers are:\n");
        
        for (int i=1; i<=10; i++) {
            out.println(i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: "+estimatedTime);   
	}
}
