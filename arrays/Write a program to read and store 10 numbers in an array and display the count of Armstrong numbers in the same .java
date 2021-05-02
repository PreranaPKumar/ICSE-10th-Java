

import java.util.Scanner;
public class array7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0,res=0,num=0,count=0;
        double sum=0;
        System.out.println("enter 10 digits");
        for(i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            num=x[i];
            sum=0;
            res=0;
         while(num!=0)
        {
            res=num%10;
            num=num/10;
            sum=sum+(Math.pow(res,3));
            
        }
        if(sum==x[i])
        {
            count++;
        }
        
    }
    System.out.println("the count of armstrong number is"+count);
}
}
