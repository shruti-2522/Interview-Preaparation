import   java.util.*;
class palindrome1
{
 public static void main(String[] args) {
     
  int n,sum=0,r,temp;

  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  temp=n;

  while(n>0)
  {
      r=n%10;
      sum=(sum*10)+r;
      n=n/10;

  }

  if(temp==sum)
  {
      System.out.println(sum+"Number Is palindrome");
  }
  else
{
    System.out.println(sum+""+"Number is not plaindrome");
}



 }
}