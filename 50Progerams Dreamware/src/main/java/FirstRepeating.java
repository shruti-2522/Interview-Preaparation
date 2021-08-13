import java.util.Scanner;

public class FirstRepeating {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter array Elemnts:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}//end for
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("First repeated element="+arr[i]);
					temp=1;
					i=n;
					j=n;
					
				   
				}//end if
			}//end inner for
			
		}//end outer for
		
		if(temp==0)
			System.out.println("No repeating element found");
		
	}

}
