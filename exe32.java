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

class exe32 {
    
    // Driver method
    public static void main(String[] args) {

        out.println(System.getSecurityManager());
        out.println("\nCurrent system environment:");
        out.println(System.getenv());	 
        out.println("\n\nCurrent system properties:");
        out.println(System.getProperties());

        // gets the value of the specified environment variable "PATH"
        out.println("\nEnvironment variable PATH: ");
        out.println(System.getenv("PATH"));

        // gets the value of the specified environment variable "TEMP"
        out.println("\nEnvironment variable TEMP: ");
        out.println(System.getenv("TEMP"));

        // gets the value of the specified environment variable "USERNAME"
        out.println("\nEnvironment variable USERNAME: ");
        out.println(System.getenv("USERNAME"));
	}
}
