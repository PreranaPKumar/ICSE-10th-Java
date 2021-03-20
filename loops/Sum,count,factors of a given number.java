import java.util.Scanner;
public class count_factors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int i,count=0,sum=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count=count+1;
                sum=sum+i;
                System.out.println(i);
            }
        }
        System.out.println("these are the factors of the given numbers");
        System.out.println("the sum of the factors is  "+sum);
        System.out.println("the cnumber of factors are "+count);
    }
}
