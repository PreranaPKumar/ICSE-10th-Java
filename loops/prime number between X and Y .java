import java.util.Scanner;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a starting number");
        int a=sc.nextInt();
        System.out.println("enter a ending number");
        int b=sc.nextInt();
        int i,j,count;
        for(i=a;i<=b;i++)//to find number between a and b
        {
            count =0;
            for(j=1;j<=b;j++)//to find the no. of factors
            {
                if(i%j==0)
                {
                    count=count+1;
                }
            }
            if(count==2)
            {
                System.out.println(i);
            }
        }
}
