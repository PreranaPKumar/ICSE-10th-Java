

import java.util.Scanner;
public class array13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i =0,l=0,max=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            x[i]=sc.nextInt();
        }
        System.out.println("speify a location succeeding which maximum is to calculated");
        l=sc.nextInt();
        for(i=l;i<=9;i++)
        {
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        System.out.println("the maximum succeeding the given position is:  "+max);
    }
}
