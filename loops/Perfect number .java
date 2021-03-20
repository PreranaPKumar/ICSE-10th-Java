import java.util.Scanner;
public class perfect_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int sum=0,b;
        for(b=1;b<a;b++)
        {
            if(a%b==0)
            {
                sum=sum+b;
            }
                
        }
        if(sum==a)
        {
            System.out.println("the number is perfect");
        }
        else
        {
            System.out.println("the number is not perfect");
        }
    }
}
