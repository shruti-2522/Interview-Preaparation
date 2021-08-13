import java.util.Scanner;

public class idimond {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int n = s.nextInt();
		int i,j,k=0;

		 for(i=1;i<n;i++)
	      {
	      for(j=n-i;j>1;j--)
	      {
	          System.out.print(" ");
	      }

	      for(j=1;j<=i;j++)
	      {
	    	  System.out.print(" "+ (k = k + 1));
			
	      }
	      System.out.println();
	      }
	    }
}

