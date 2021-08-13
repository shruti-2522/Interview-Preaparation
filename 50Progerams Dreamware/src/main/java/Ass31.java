import java.util.Scanner;

public class Ass31 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int n = s.nextInt();
		int i,j,k,l;
		
		for (i=1; i<=n; i++)
		{
			  for (j=1; j<=(n-i)*2; j++)
			  {
			   System.out.print(" ");
			  }
			for (k=i; k>=1; k--)
			{
			  System.out.print(" "+k);       
			}                                        
			for (l=2; l<=i; l++)
			{
			  System.out.print(" "+l);   
			}//end outer for loop                            
			System.out.println();
			}                                    
	}
}

/*OUTPUT:

*/