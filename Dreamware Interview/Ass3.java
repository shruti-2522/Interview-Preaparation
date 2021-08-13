import java.util.*;
class Ass3
{
    public static boolean isEven(int num)
    {
        return (num % 2==0);
    }

    
    public static void main(String[] args) {
        int []  arr=new int[10];
        int gno=20;

       Scanner s=new Scanner(System.in);
       System.out.println("Enter Array");
       for(int i=0;i<10;i++)
        arr[i]=s.nextInt();


        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(isEven(arr[i]) && isEven(arr[j]) && gno==(arr[i]+arr[j]))
                  System.out.println("["+arr[i]+","+arr[j]+"]");
            }
        }


    }


}

/*OUTPUT:
Enter Array
5 8 3 6  10 15 14 69 3
20
[6,14]
*/