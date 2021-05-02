

import java.util.Scanner;
public class array3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int x[]=new int[10];
        System.out.println("Enter 10 numbers");
        for(i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("the first digit in the aaray is"+x[0]);
        System.out.println("the last digit in the aaray is"+x[9]);
    }
}
 
