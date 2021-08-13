import java.util.Scanner;

public class dimondStar {
	
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter Number of rows");
	int n=s.nextInt();
	
	
	  
    // Print upper half of pattern  
    for(int i=1; i<=n; i++)
    {
        // We print left side stars.
        for(int j=i; j<=n; j++)
        {
            System.out.print("*");
        }
        
        // Then print spaces , first row has one blank space
        for(int j=1; j<=(2*i-1); j++)
        {
            System.out.print(" ");
        }
        
        // then we print right side stars.
        for(int j=i; j<=n; j++)
        {
            System.out.print("*");
        }
 
        System.out.println();
    }
 
    // Loop to print lower half of the pattern
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        // Here we decrease no. of blank spaces after each printing each row.
        for(int j=(2*i-2); j<(2*n-1); j++)
        {
            System.out.print(" ");
        }
 
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
 
        System.out.println();
    }
	
	}
	
	

}
