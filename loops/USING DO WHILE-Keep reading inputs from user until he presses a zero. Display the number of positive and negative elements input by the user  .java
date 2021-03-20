import java.util.Scanner;
public class input_cntrol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b=1,i;
        do
        {
            System.out.println("enter a number");
            a=sc.nextInt();
           
            if(a>=1)
            {
                System.out.println("positive");
                
            }
             else if(a<0)
            {
                System.out.println("negetive");
            }
        }while(a!=0);
    }
}
