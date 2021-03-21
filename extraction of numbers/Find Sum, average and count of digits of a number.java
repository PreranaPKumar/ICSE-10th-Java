import java.util.Scanner;
public class extracion
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int sum=0,avg=0,count=0,res=0;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            sum=sum+res;
            count=count+1;
            
        }
        avg=sum/count;
        System.out.println("the sum is  "+sum);
        System.out.println("the count is  "+count);
        System.out.println("the average is  "+avg);
    }
}
