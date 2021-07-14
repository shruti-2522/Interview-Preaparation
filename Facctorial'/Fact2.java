import java.util.Scanner;

class Fact2
{

    static int factorial(int n)
    {

        if(n==0)
         return 1;
         else
         return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int n,fact;
        Scanner  s=new  Scanner(System.in);
        System.out.println("Enter Any Number:");
        n=s.nextInt();
        fact=factorial(n);
        System.out.println("Factorial of number="+fact);
    }
}