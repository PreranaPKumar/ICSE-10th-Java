
import java.util.Scanner;
public class array11
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int x[]=new int [10];
       int i=0,even=0,odd=0;
       System.out.println("enter 10 elements");
       for(i=0;i<=9;i++)
       {
           x[i]=sc.nextInt();
           if(x[i]%2==0)
            {
                x[i]=x[i]+2;
            }
            else 
            {
                x[i]=x[i]+3;
            }     
        }        
         System.out.println("the new array is  ");
        for(i=0;i<=9;i++)
       {
           System.out.println(x[i]);
        }
    }
}
