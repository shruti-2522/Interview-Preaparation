import java.util.*;
class prime4
{
 public static void main(String[] args) {

     int a,b;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter First Number:");
     a=s.nextInt();
     System.out.println("Enter Second Number:");
     b=s.nextInt();

     System.out.println("Two Numbers are"+a+""+b);
     for(int i=a;i<=b;i++)
     {
         if(isPrime(i))
         {
             System.out.println(i);
         }
     }
  }

  public static boolean isPrime(int n)
  {
      if(n<=1)
      {
          return false;
      }
      else{
          for(int i=2;i<=Math.sqrt(n);i++)
          {
              if(n%i==0)
              {
              return false;
              }
          }
          return true;
      }
  }
}

