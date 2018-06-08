import java.util.*;
import java.lang.*;
import java.io.*;

import static java.lang.System.out;
import java.lang.Object;
import java.lang.Number;
import java.lang.Integer;
import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class exe13 {
	public static void main (String[] args) throws java.lang.Exception {
        out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
        Date d1 = new java.util.Date();
        out.format("\nCurrent Date time: %tc%n \n", System.currentTimeMillis());
        out.println(d1 + "\n");
	}
}
