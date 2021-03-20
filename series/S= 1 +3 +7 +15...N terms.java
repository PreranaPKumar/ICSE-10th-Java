import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // 1 +3 +7 +15..n terms
        System.out.println("enter the number");
        int n=sc.nextInt();
        double a,y=0,sum=0,sum1=0;
        int i;
        for(i=1;i<=n;i++)
        {
            a=Math.pow(2,y);
            sum=sum+a;
            sum1=sum+a;
            y=y+1;
            
        }
        System.out.println("the sum is  "+sum1);
    }
}
