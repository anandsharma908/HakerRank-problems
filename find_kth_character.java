import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class find_kth_character {

	public static void main(String[] args) {		
		int len=0;
		int k=9;
		String s="ab4c2ed3";
		Pattern p=Pattern.compile("[0-9]+");
		Matcher m=p.matcher(s);
		String[] str=p.split(s);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length && m.find();i++)
		{
			len=Integer.parseInt(m.group());
			for(int j=0;j<len;j++)
			sb.append(str[i]);			
		}
		System.out.println(sb.charAt(k-1));		
	}

}
