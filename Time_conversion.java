import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time_conversion {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String in = sc.next();
	    char[] inChar = in.toCharArray();
	    char[] out = Arrays.copyOfRange(inChar, 0, 8);
	    if(inChar[8] == 'A' && in.substring(0,2).equals("12")) {
	        out[0] = '0';
	        out[1] = '0';
	        System.out.println("AM 12");
	    }
	    else if(inChar[8] =='P' && in.substring(0,2).equals("12")) {
	        String s = "" + (Integer.parseInt(in.substring(0,2)));
	        char[] f = s.toCharArray();
	        out[0] = f[0];
	        out[1] = f[1];
	        System.out.println(12);
	    }
	    else if(inChar[8] =='P' && in.substring(0,2) != "12") {
	        String s = "" + (Integer.parseInt(in.substring(0,2)) + 12);
	        char[] f = s.toCharArray();
	        out[0] = f[0];
	        out[1] = f[1];
	        System.out.println("more then 12");
	    }
	    
	    System.out.println(out);
	}

}
