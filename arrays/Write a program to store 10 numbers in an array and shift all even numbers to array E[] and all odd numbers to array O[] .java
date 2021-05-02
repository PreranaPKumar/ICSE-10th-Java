import java.util.Scanner;
public class array27
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];   
        int e[]=new int[10];
        int o[]=new int[10];
        int i=0;
        for(i=0;i<=9;i++)
        {
         System.out.println("enter a element");
         x[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
       {
            if(x[i]%2==0)
            {
                e[i]=x[i];
            }
            else
            {
                o[i]=x[i];
            }            
       }
       System.out.println("the even numbers are:  ");
       for(i=0;i<=9;i++)
        {
            if(e[i]==0)
            {
             continue;
            }
             else
             {
             System.out.println(e[i]);
            }
        }
       System.out.println("the odd numbers are:  ");
       for(i=0;i<=9;i++)
        {
            if(o[i]==0)
            {
             continue;
            }
             else
             {
             System.out.println(o[i]);
            }
        }
    }
}
    