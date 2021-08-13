import java.util.*;
class  Ass2
{

    public  static boolean checkVowel(char ch)
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
        Scanner  s=new Scanner(System.in);
        System.out.println("Enter String:");
        String str1=s.nextLine();

        for(int i=0;i<str1.length();i++)
        {
            if(checkVowel(str1.charAt(i)))
            {
                continue;
            }
            System.out.println(""+str1.charAt(i));
        }
    }
}

/*OUTPUT:
Enter String:
programmming
r,g,r,m,m,n,
*/