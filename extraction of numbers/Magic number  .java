import java.util.Scanner;
public class magic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int res=0,sum=0;
        sum=num;
        while(sum>9)
        {
            num=sum;
            sum=0;
            while(num>0)
            {
                res=num%10;
                num=num/10;
                sum=sum+res;
                System.out.println(sum);
            }
        }
        if(sum==1)
        {
            System.out.println("magic number");
        }
        else
        {
            System.out.println("not a magic number");
        }
        
    }
}
