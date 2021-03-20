import java.util.Scanner;
public class natural_sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" the sum of natural number till 100");
        int i,sum=0;
        for(i=1;i<=100;i++)
        {
            sum=sum+i;
        }
            System.out.println(sum);
        
    }
}
