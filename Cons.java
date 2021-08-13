import java.util.Scanner;

class Cons
{
    public static boolean checkVowel(char ch)
    {
        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
             return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String s1=s.next();

        for(int i=0;i<s1.length();i++)
        {
            if(checkVowel(s1.charAt(i)))
            {
                System.out.print(s1.charAt(i-1)+","+s1.charAt(i+1)+",");
            }
        }
    }
}