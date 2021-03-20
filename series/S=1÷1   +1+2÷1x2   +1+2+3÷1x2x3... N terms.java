import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of digits");
        int n=sc.nextInt();
        int b=1,x=1,a=0,c,i;
        double sum=0;
        for(i=1;i<=n;i++)
        {
            a=a+x;
            b=b*x;
            c=a/b;
            x++;
            sum=sum+c;
        }
        System.out.println(sum);
    }
}
