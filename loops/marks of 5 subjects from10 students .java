import java.util.Scanner;
public class marks_10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,a,sum=0;
        for(i=1;i<=10;i++)
        {
            sum=0;
            System.out.println("enter studemts marks");
            for(j=1;j<=5;j++)
            {
                System.out.println("enter the marks");
                a=sc.nextInt();
                sum=sum+a;
            }
            System.out.println("the sum is  "+sum);
        }
        
        
    }
}
