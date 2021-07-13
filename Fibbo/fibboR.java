import java.util.Scanner;

class fibboR
{
   static int n1=0,n2=1,n3;

    static void printFibbo(int num)
    {
       
        if(num>0)
        {
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
            printFibbo(num-1);
        }
    }



    public static void main(String args[])
    {
     int num;
     Scanner s=new Scanner(System.in);   
     System.out.println("How many numbers");
     num=s.nextInt();
     System.out.println(""+n1+"\n"+n2);
     printFibbo(num-2);



    }

}