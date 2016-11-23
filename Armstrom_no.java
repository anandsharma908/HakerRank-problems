import java.util.Scanner;

public class Armstrom_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long n1=N;
		String str=String.valueOf(N);
		long sum=0;
		for(long i=0;i<str.length();i++)
		{
			long mod=N%10;
			sum+=Math.pow(mod, str.length());
			N=N/10;
		}
		if(sum==n1)
		System.out.println(n1+" is "+"Armstrong number "+sum);
		else
			System.out.println(n1+" is "+"NOT Armstrong number "+sum);
	}

}
