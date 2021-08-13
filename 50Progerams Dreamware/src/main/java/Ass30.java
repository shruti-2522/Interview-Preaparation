import java.util.Scanner;

public class Ass30 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of rows:");
		int n=s.nextInt();
		int i,j;
		char ch='A';
		for(i=1;i<=n;i++)
		{
		
			for(j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
				
			}
			
			System.out.println();
		}
	}

}

/*Output:
A 
B C 
D E F 
G H I J 
K L M N O 
*/

