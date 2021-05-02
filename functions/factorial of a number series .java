import java.util.Scanner;
public class function8
{
    /*factorial foa anumber
            power of x,y
            x^2/2!, xe4/4!..
             series loop in main method*/
             
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("enter the number of terms");
        int term=sc.nextInt();
        int res2,x=2;
        double sum=0,res1;
        function8 obj= new function8();
        for(int i=1;i<=term;i++)
        {
            res1= obj.power(num,x);
            res2=obj.fac(x);
            sum= sum+(res1/res2);
            x=x+2;
            
        }
        System.out.println("the sum is  "+sum);
    }
    double power( double num, int p)
     {
        double pow=Math.pow(num,p);
        return pow;
    }
    int fac(int num)
    {
        int fact=1;
        for(int j=1;j<=num;j++)
        {
            fact=fact*j;
        }
        return fact;
    }
}
    
        
        