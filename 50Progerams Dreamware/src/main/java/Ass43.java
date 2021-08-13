import java.util.Scanner;

public class Ass43 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int n=s.nextInt();
		
		int i,j;
		
		
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
			System.out.print(" "+j);
			}
			System.out.println(" ");
		}
		
	}

}

/*OUTPUT:
  1 
 2 1 
 3 2 1 
 4 3 2 1 
 5 4 3 2 1 
 */

