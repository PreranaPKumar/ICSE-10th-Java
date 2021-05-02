
import java.util.Scanner;
public class array16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[20];
        int i=0,sum1=0,sum2=0;
        for(i=0;i<=19;i++)
        {
            System.out.println("enter a element");
            x[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            sum1=sum1+x[i];
        }
        for(i=10;i<=19;i++)
        {
            sum2=sum2+x[i];
        }
        if(sum1>sum2)
        {
            System.out.println("the sum of first half is greater" +sum1);
        }
        else
        {
            System.out.println("the sum of second half is greater" +sum2);
        }    }
}
