import java.util.Scanner;
public class input_cntrol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b=1,i;
        for(i=1;i>=1;i++)
        {
            System.out.println("enter a number");
            a=sc.nextInt();
            if(a==0)
            {
                System.out.println("you entered zero");
                b=0;
            }
            if(b==0)
            break;
            if(a>=1)
            {
                System.out.println("positive");
                
            }
            else
            {
                System.out.println("negetive");
            }
        }
    }
}
