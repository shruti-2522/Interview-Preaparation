import  java.util.*;
class Fact1
{
    public static void main(String[] args) {
        
        int fact=1,num;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        num=s.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial="+fact);
    }
}