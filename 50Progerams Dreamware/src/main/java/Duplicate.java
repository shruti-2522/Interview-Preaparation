
public class Duplicate {
	
	public static void main(String args[])
	{
		
		  String str="javauii";
		  int length=str.length();
		  
		  char[] ch=str.toCharArray();
		
		  for(int i=1;i<length;i++)
		  {
			  
			  for(int j=i+1;j<length;j++)
			  {
				  if(ch[i]==ch[j])
				  {
				  System.out.println("Duplicate Elements="+ch[j]);
				  break;
				  }
			  }
		  }
	}

}

/*OUTPUT:
  Duplicate Elements=a
 * */
