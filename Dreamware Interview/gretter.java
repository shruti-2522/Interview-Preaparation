import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class gretter
{

    public static void main(String[] args) {
        int a,b,c;

        Scanner s=new Scanner(System.in);

        System.out.println("Enter Any three Numbers:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if(a>b)
          {
        if(a>c)
        {
         System.out.println(a+" "+"is gretter");
        }
         else
         {
         System.out.println(c+" "+"is gretter");
         }
          }
        
         else
         if(b>a)
         {
         System.out.println(b+" "+"is gretter");
         }
         else
         {
         System.out.println(a+" "+"is gretter");
         }
        

    }


   

}