import java.util.Scanner;
public class function3
{
    int pow(int x,int y)
    {
        int i=1;
        int sum=1;
        while(i<=y)
        {
            sum=sum*x;
            i++;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        function3 obj=new function3();
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=obj.pow(a,b);
        System.out.println( a+" to the power "+b+" is "+p);
    }
}
    
            