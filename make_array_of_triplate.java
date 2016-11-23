import java.util.Scanner;

public class make_array_of_triplate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		 int M = 1000000007;
		int[] arr=new int[N];
		int count=0;
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			int x=arr[i];			
			for(int j=i+1;j<N-1;j++)
			{
				int y=arr[j];
				if(x<y )
					{
					for(int k=j+1;k<N;k++)
					{
						if(y>arr[k])
							count++;
					}
					}
				else
					if(x>y )
					{
					for(int k=j+1;k<N;k++)
					{
						if(y<arr[k])
							count++;
					}
					}
				}	
			}
		System.out.println(" "+count%M);	
		}
	}


