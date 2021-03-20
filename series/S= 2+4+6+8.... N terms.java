import java.util.Scanner;
public class even_series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // 2+4+6..nth term
        System.out.println("enter the number of terms");
        int a=sc.nextInt();
        int i,sum=0,x=2;
        for(i=1;i<=a;i++)
        {
            sum=sum+x;
            x=x+2;
        }
        System.out.println("the total is  "+sum);
    }
}
