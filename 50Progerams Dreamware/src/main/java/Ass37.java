import java.util.Scanner;

public class Ass37 {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int n=s.nextInt();
		int i,j;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
			
		}
		
		for (i = 0; i < n; i++) {
			for (j = n - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	
				
	}
}
