import java.util.*;
class prime1
{
    public static void main(String args[])
    {
        int m=0,n,flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number");
        n=s.nextInt();

        m=n/2;

        if(n==0||n==1)
        {
            System.out.println("Number is  not prime"+n);
        }
        else{
            for(int i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println("Not prime"+n);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("Number is prime"+n);
            }
        }
    }
}