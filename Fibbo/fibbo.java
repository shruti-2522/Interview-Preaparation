import java.util.Scanner;

class fibbo
{
 public static void main(String[] args) {

    int  a=0,b=1,num,c;
    Scanner s=new Scanner(System.in);
    System.out.println("How  many Terms You want to print");
    num=s.nextInt();
    System.out.println(""+a+"\n"+b);
    for(int i=2;i<num;i++)
    {
      
      c=a+b;

     
      a=b;
      b=c;
      System.out.println(""+c);
    }

      
  }
  }
