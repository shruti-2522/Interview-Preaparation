import java.util.Scanner;

public class Ass8 {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Array Size:");
		int n=s.nextInt();
		
		int arr1[]=new int[n];
		int arr2[]=new int [n];
		
		System.out.println("Enter First Array Elements:");
		for(int i = 0;i<n;i++)
		{
			arr1[i]=s.nextInt();
		
		}
		
		System.out.println("Enter Second Array Elements:");
		for(int i = 0;i<n;i++)
		{
			arr2[i]=s.nextInt();
		
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.print(arr2[j]);
			}
			
		}
	}

}
