import java.util.Scanner;

class Upper
{
    public static boolean isUpper(char ch)
    {
        switch(ch)
        {

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
             return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String:");
        String s1=s.nextLine();
        for(int i=0;i<=s1.length();i++)
        {
            if(isUpper(s1.charAt(i)))
            {
                System.out.print("First Uppercase Letter="+s1.charAt(i));
            }
        }
    }
}