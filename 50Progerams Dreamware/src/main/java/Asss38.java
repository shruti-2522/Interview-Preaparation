import java.util.Scanner;

public class Asss38 {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		int n=s.nextInt();
		int i,j;
		
	
		for (i=1; i<=n; i++)
        {
		for(j=n; j>i; j--)
        {
            System.out.print(" ");
        }
        // Print star in increasing order
        for (j=1; j<=(i * 2) -1; j++)
        {
            if( j == 1 || j == (i * 2) -1 || i ==n)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }}
	
	

}
