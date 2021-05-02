
import java.util.Scanner;
public class array14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[20];
        int i =0,a=0,b=1,c=0;
         System.out.println("first 20 fibonacci series is:"); 
        for(i=0;i<=19;i++)
        {                     
            x[i]=b;            
            c=a+b;
            a=b;
            b=c;
            System.out.println(x[i]);

        }
    }
}
