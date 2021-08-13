import java.util.Scanner;

public class Ass47 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number Of rows:");
	    int n=s.nextInt();
	    int i,j;
	    char ch;
	    
	    for(i=0;i<=n;i++)
	    {
	    	ch='A';
	    	for(j=i;j<=n;j++)
	    	{
	    		System.out.print(ch+" ");
	    		ch++;
	    	}
	    	System.out.println();
	    }
	    
	    for(i=0;i<=n;i++)
	    {
	    	ch='A';
	    	for(j=0;j<=i;j++)
	    	{
	    		System.out.print(ch+" ");
	    		ch++;
	    	}
	    	
	    	System.out.println();
	    }
	}

	
}

/*OUTPUT:
 * 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 

*/
