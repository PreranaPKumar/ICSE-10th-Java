import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int res=0,sum=0;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            sum=sum+res;
            num=num/10;
        }
        System.out.println(sum);
    }
}
 
