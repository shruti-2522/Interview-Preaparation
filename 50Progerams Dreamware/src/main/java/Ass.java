import java.util.Scanner;

public class Ass {
	
	public static void Main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int n=s.nextInt();
		
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

