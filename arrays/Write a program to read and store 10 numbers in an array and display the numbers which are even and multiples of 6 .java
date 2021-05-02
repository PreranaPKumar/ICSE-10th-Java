

import java.util.Scanner;
public class array5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0;
        System.out.println("enter 10 digits");
        System.out.println("this will print even or multiples of 6");
        for( i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
         for(i=0;i<=9;i++)
        {
            
            if(x[i]%2==0||x[i]%6==0)
            {
                System.out.println(x[i]);
            }
        }
    }
}
