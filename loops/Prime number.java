import java.util.Scanner;
public class prime_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int i,prime=0,count=0;
        for(i=1;i<=a;i++)
        {
           if(a%i==0)
           {
               count=count+1;
           }
        }
        if(count==2)
        {
            System.out.println("it is prime");
        }
        else
        {
            System.out.println("it is not prime");
        }
    }
}
