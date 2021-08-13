import java.util.Scanner;

public class Rpattern {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of rows");
		int n=s.nextInt();
		
		int i,j;
		
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		
	}


}
