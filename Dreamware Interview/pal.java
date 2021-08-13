import java.util.Scanner;

class pal
{
    public static void main(String[] args) {
        
        int rev=0,rem;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num=s.nextInt();

        int temp=num;
        while(num>0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;

        }

        if(temp==rev)
         System.out.println(rev+"Palindrome number");
         else
        System.out.println("Not pali");
    
    }
}