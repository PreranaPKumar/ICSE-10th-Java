import java.util.Scanner;
public class small_large
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int i;
        for(i=a-1;i<=a;i--)
        {
            if(a%i==0)
            {
                break;
            }
        }
        System.out.println("the largest factor is  "+i);
        
    }
}
}
