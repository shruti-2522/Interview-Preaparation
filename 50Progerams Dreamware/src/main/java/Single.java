
import java.util.Scanner;
public class Single{
public static void findSingle(int arr[])
		{
			int count[]=new int[10];
			
			for(int i=0;i<10;i++)
			{
				count[arr[i]]++;
			}
			
			for(int i=0;i<10;i++)
			{
				if(count[i]==1)
					System.out.println(""+i);
			}
		}
		
		
		public static void main(String args[])
		{
			
			Scanner s=new Scanner(System.in);
			int arr[]=new int[10];
			System.out.println("Enter Array Elements:");
			for(int i=0;i<10;i++)
			{
				arr[i]=s.nextInt();
			}
			
			findSingle(arr);
			
		}

	}


