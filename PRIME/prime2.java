class prime2
{
    static void checkPrime(int n)
    {
        int m=0,i,flag=0;

        m=n/2;
        if(n==0||n==1)
        {
            System.out.println("Number is Not prime");
        }
        else{
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                System.out.println("Number is not prime:"+n);
                flag=1;
                break;
                }
            }

            if(flag==0)
            {
                System.out.println("Prime number"+n);
            }
        }

    }

    public static void main(String[] args) {
        checkPrime(10);
        checkPrime(3);
        checkPrime(35);
        checkPrime(20);
    }
}