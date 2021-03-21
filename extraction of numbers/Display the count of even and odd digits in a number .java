import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int res=0,odd=0,even=0;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            if(res%2==0)
            {
                even=even+1;
            }
            else
            {
                odd=odd+1;
            }
        }
        System.out.println("the number of odd terms are   "+odd);
        System.out.println("the number of even terms are  "+even);
    }
}
