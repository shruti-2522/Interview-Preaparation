class Stras
{
    public static void main(String[] args) {
        
        for(int i=0;i<=4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n");

        for(int i=0;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
             System.out.print("*");
            }
            System.out.println();
        }

    }
}