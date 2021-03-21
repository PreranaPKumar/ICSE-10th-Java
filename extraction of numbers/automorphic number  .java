import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int a=1;
        double res=0,sum=0,num1;
        num1=Math.pow(num,2);
        System.out.println(num1);
        sum=a*res;
        sum=(int)sum;
        a=a*10;
        if(sum==num)
        {
            System.out.println("automorphic");
        }
        else
        {
            System.out.println("not automorphic");
        }
        
        
    }
}
