import java.util.Scanner;

public class Ass36 {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Nuber of rows:");
		int n=s.nextInt();
		int i,j;
		
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


}


/*OUTPUT:
  *
 **
***
****
*****
****
***
 **
  *

*/