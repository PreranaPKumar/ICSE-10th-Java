
import java.util.Scanner;
public class array18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[5];
        int c[]=new int[5];

        int i=0, evenl=0 , odds=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            a[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        {           
                b[i]=a[i];
        }
        for(i=5;i<=9;i++)
        {  
          c[i-5]=a[i];
         }
        System.out.println("elements in array b are:");
        for(i=0;i<=4;i++)
        {           
            System.out.println(b[i]);            
        }
        System.out.println("elements in array c are:");
        for(i=0;i<=4;i++)
        {           
            System.out.println(c[i]);            
        }
    }
}
