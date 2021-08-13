import java.util.Scanner;

public class Ass46 {

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
				System.out.print(" "+(j+1));
			}
			
			
			System.out.println();
			
		}
		
		
		for ( i = n-1; i > 0; i--) 
        {
             for (j = 0; j <=i; j++) 
            {
                System.out.print(" ");
            }
            for ( j= i; j <=n; j++)
            {
                System.out.print(j+" ");
            }
              
            System.out.println();
        }
         
    


				
	}
}
