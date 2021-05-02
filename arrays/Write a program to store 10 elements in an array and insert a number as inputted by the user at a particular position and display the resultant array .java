import java.util.Scanner;
public  class array35
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0,count=0;
        while(i<=9)
        {
            System.out.println("enter the position");
            i=sc.nextInt();
            System.out.println("enter the element");
            x[i]=sc.nextInt();
            count++;
            if(count==10)
            {
            break;
        }
        }
        System.out.println("the array is");
        for(i=0;i<=9;i++)
        {
            System.out.println(x[i]);
        }
    }
}
            
            
        