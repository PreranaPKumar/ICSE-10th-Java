import java.util.Scanner;
public class even_factors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int i,sum=0,count=0;
        System.out.println("the even factors are");
        for(i=1;i<=a;i++)
        {
            if(a%i==0 && i%2==0)
            {
                count=count+1;
                sum=sum+i;
                System.out.println(i);
            }
           
        }
         System.out.println("the sum of the factors are "+sum);
            System.out.println("the number of factors are "+count);
    }
}
