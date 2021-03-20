import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        int a=1,c=1,d=0,i;
        double sum=0;
        for(i=1;i<=n;i++)
        {
            d=(c*10)+a+1;
            c=d;
            a++;
            sum=sum+d;
        }
        System.out.println(sum);
        
    }
}
