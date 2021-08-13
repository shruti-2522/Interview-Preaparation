import java.util.Scanner;

public class Ass40 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number Of rows:");
		int n=s.nextInt();
		
		int i,j;
		
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}


/*OUTPUT:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/