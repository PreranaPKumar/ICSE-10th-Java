import java.util.Scanner;
public class HCF_LCM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int i,hcf=0,lcm=0;
        for(i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("the HCF of the given numbers is  "+hcf);
        
        
        lcm=(a*b)/hcf;
        System.out.println("the LCm of the given numbers is  "+lcm);
    }
}
