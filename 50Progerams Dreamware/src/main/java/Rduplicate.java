import java.util.Scanner;

public class Rduplicate {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Array Size:");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}//end for
		
		 int l=arr.length;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[l-1];
					l--;
					
				}//end if
			}//end inner for
		}//emd outer for
		
		System.out.println("Print an Array After removing duplicate array:");
		for(int i=0;i<l;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
	}//end main

}//end class


/*OUTPUT:
0
Enter Array Elements:
2
3
1
2
3
1
2
3
1
1
Print an Array After removing duplicate array:
 2 3 1 1 3
*/