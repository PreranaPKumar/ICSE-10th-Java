
import java.util.Scanner;
public class array9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[6];
        int i=0,max=999,sum=0;
        System.out.println("enter 6 elements");
        for(i=0;i<=5;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<=5;i++)
        {
            if(x[i]<=max)
            {
                max=x[i];
            }
            sum=sum+x[i];
        }
        sum=sum-max;
        System.out.println("the sum of 5 best subjects is  "+sum);
    }
}
 
