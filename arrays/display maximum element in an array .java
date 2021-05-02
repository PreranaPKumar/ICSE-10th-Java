
import java.util.Scanner;
public class array8
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0,max=0;
        System.out.println("enter 10 elements");
        for(i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        System.out.println("the largest number is  "+max);
    }
}
