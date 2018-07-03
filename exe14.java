import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class exe14 {
	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}
    
    // public static void main (String[] args) throws java.lang.Exception {
    //     out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
    //     Date d1 = new java.util.Date();
    //     out.format("\nCurrent Date time: %tc%n \n", System.currentTimeMillis());
    //     out.println(d1 + "\n");
	// }
}


