import java.util.Scanner;
public class next_prime
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     int a=sc.nextInt();
     int i,j,b,count=0;
     b=a+1;
     for(i=b;i>a;i++)
     {
         count=0;
         for(j=1;j<=i;j++)
         {
             if(i%j==0)
             {
                 count=count+1;
             }
         }
         if(count==2)
         {
             System.out.println("the next prime number is  "+i);
         }
     }
     
    }
}
