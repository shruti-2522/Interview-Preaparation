import java.util.Scanner;

public class Ass34 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int  n=s.nextInt();
		
	    int i,j;
	    
	    for(i=0;i<=n;i++)
	    {
	    	for(j=i;j<=n;j++)
	    	{
	    			System.out.print(" ");
	    	}
	    	
	    

			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(j=1;j<i;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
			
		}
	    for(i=2;i<=n;i++)
	    {
	    	for(j=1;j<=i;j++)
	    	{
	    			System.out.print(" ");
	    	}
	    	
	    

			for(j=i;j<n;j++)
			{
				System.out.print("*");
			}
			
			for(j=i;j<=n;j++)
			{
				System.out.print("*");
			
			}
			System.out.println();
			
		}
	    	
	    }
	
}

/*OUTPUT:
*
 ***
*****
*******
*********
*******
*****
 ***
  *

*/