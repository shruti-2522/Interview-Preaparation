import java.util.Scanner;

public class Ass3 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		int i,j,missing_no=0,espace=0,r=0,sum=n*(n+1)/2;
		
		System.out.println("Enter Array Elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				espace=i;
			}
			else
			{
				r=r+arr[i];
			}
		}
		
		missing_no=sum-r;
		System.out.println("Missing Number is="+missing_no);
		
		
	}

}
