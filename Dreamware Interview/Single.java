
class Single
{
public static void findSingle(int arr[])
{
    int count[]=new int[10];
    for(int i=0;i<10;i++)
    {
        count[arr[i]]++;
    }

    //find single element1
    for(int i=0;i<10;i++)
    {
        if(count[i]==1)
        {
            System.out.println("Result:"+i);
        }
    }
}


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int arr[]=new int[10];
        System.out.println("Enyter Array:");
        for(int i=0;i<10;i++)
        {
          arr[i]=s.nextInt();
        }
        findSingle(arr);
    }




}