import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int a=sc.nextInt();
        int num=a;
        int res=0;
        double sum=0;
while(num!=0)
        {
            res=num%10;
            num=num/10;
            sum=sum+(Math.pow(res,3));
            
        }
        if(sum==a)
        {
            System.out.println("an armstrong number ");

        }
        else
        {
            System.out.println("not an armstrong number ");
        }
    }
}
