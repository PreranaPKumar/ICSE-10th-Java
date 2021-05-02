
import java.util.Scanner;
public class array17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0, evenl=0 , odds=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            x[i]=sc.nextInt();
            odds=x[1];
            if(x[i]>evenl && x[i]%2==0)
            {
                evenl=x[i];
            }
        }
        odds=evenl;
        for(i=0;i<=9;i++)
        {
            if(x[i]<odds && x[i]%2!=0)
            {
               odds=x[i];
            }
        }
        System.out.println("the largest even number is:  "+evenl);
        System.out.println("the smallest odd number is:  "+odds);
    }
}
