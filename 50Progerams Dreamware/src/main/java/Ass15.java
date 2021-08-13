import java.util.Scanner;

public class Ass15 {
	
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sttring");
		  String str=s.next();
		
		  int[] arr=new int[256];
		
		  for(int i=0;i<str.length();i++)
		  {
			  
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		  }
		  
		  int high=1;
		  char c=' ';
		  
		  for(int i=0;i<str.length();i++)
		  {
			  if(high<arr[str.charAt(i)])
			  {
				 
				  high=arr[str.charAt(i)];
				  c=str.charAt(i);
				  
			  }
		  }
		  System.out.println("Highest Occurences of charecter is="+c);
	}

}

/*OUTPUT:
  Duplicate Elements=a
 * */
