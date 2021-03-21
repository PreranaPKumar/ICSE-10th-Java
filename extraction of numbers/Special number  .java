import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int digit=num;
        int i,res=0,sum=0,a=1;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            a=1;
            for(i=1;i<=res;i++)
            {
                a=i*a;
            }
            sum=sum+a;
      }
        if(sum==digit)
        {
            System.out.println("special number");
        }
        else
        {
            System.out.println("not a special number");
        }
    }
}
