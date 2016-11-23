import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Float_find {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("(+|-)?\\d*\\.\\d+");
		Matcher m;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			String str=sc.next();
		m=p.matcher(str);
		if(m.find())
			System.out.println("true");			
			else
				System.out.println("false");	
		
		}

	}

}
