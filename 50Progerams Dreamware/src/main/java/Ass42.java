import java.util.Scanner;

public class Ass42 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int n=s.nextInt();
		
		int i,j;
		
		
		for(i=0;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
			System.out.print(" "+(n-j));
			}
			System.out.println(" ");
		}
		
	}

}

/*OUTPUT:
  5 
 5 4 
 5 4 3 
 5 4 3 2 
 5 4 3 2 1 

*/
