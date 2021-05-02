

import java.util.Scanner;
public class array4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,a=0,b=0,temp=0,j=9;
        int x[]=new int[10];
        System.out.println("Enter 10 numbers");
        for(i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            
           temp= x[i];
             x[i]=x[j];
             x[j]=temp;
             j--;
            }
         System.out.println("the array in reverse order is");   
         for(i=0;i<=9;i++)
        {
             System.out.println(x[i]);
        }
    }
}
