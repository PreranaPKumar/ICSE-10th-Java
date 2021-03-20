import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        System.out.println("enter the value of x");
        int num=sc.nextInt();
        int i,x=1,y=2,z=2,b=1;
        double sum=0,a;
        for(i=1;i<=n;i++)
        {
            b=b*x*y;
            x=y+1;
            y=x+1;
            a=Math.pow(num,z);
            z=z+2;
            sum=sum+a/b;
        }
        System.out.println(sum);
    }
}
