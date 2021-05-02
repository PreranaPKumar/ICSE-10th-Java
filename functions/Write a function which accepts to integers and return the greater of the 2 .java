import java.util.Scanner;
public class function1
{
    int max(int a, int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        function1 obj=new function1();
        System.out.println("enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int m=obj.max(num1,num2);
        System.out.println("the maximum of the two numbers is "+m);
    }
}