
public class find_words {

	public static void main(String[] args) {
		String str="geeksforgeeks";
				String str1="gks";
				System.out.println(count(str,str1,str.length(),str1.length()));

	}

	private static int count(String str, String str1, int length, int length2) {
		if((length==0 && length2==0) || length2==0)
			return 1;
		
			if(length==0)
				return 0;
		if(str.charAt(length-1)==str1.charAt(length2-1))
			return count(str,str1,length-1,length2-1)+count(str,str1,length-1,length2);
		else
			return count(str,str1,length-1,length2);		
	}

}
