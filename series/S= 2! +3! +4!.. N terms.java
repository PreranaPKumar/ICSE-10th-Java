import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        double sum=0;
        int a=1,x=1,y=2,i;
        for(i=1;i<=n;i++)
        {
            a=x*a*y;
            sum=sum+a;
            x=y+1;
            y=x+1;
        }
        System.out.println("the sum is  "+sum);
        
    }
}
