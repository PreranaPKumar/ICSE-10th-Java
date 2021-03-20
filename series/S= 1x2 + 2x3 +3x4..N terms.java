import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // 1*1 +2*3 +4*5...n terms
        System.out.println("enter the number of terms");
        int n =sc.nextInt();
        int x=1;
        int y=2;
        int i;
        double sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+(x*y);
            x=x+1;
            y=y+1;
        }
        System.out.println("the sum is  "+sum);
    }
}
