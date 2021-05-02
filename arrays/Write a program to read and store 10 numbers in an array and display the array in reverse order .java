

import java.util.Scanner;
public class array2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0;
        System.out.println("enter 10 digits");
        for( i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("the aaray in reverse order is:");
        for(i=9;i>=0;i--)
        {
            System.out.println(x[i]);
        }
    }
}
 
