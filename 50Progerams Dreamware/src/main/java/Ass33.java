import java.util.Scanner;

public class Ass33 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int n=s.nextInt();
		int i,j,col = 1;
		
		
		  for ( i = 0; i <n; i++)
	        {
	            for ( j = 1; j <n-i; j++)
	            {
	                System.out.print(" ");
	            }
	          
	            
	            for(j=0;j<=i;j++)
	            {
	            	if(j==0 || i==0)
	            		col=1;
	            	else
	            		col=col*(i-j+1)/j;
	            	System.out.print(" "+col);
	            }
	            
	            System.out.println();
	        }
	}

}
