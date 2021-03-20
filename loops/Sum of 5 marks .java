import java.util.Scanner;
public class marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,sum=0;
        for(i=1;i<=5;i++)
        {
            System.out.println("enter the marks");
            a=sc.nextInt();
            sum=sum+a;
            
            
        }
        System.out.println("the sum of these are  "+sum);
        
    }
}
