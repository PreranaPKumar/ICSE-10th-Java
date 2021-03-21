import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int res=0,sum=0,count=0;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            count=count+1;
            if(count<=1)
            {
                sum=sum+res;
            }
        }
        sum=sum+res;
        System.out.println(sum);
    }
}
