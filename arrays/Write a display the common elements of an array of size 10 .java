import java.util.Scanner;
public class array36
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int y[]=new int[10];
        int a=0,count;
        for(int i=0;i<=9;i++)
        {
            System.out.println("Enter a element");
            x[i]=sc.nextInt();                   
    }
    outer:for(int i=0;i<=9;i++)
        {
         a=x[i];
         count=0;
         for(int j=0;j<i;j++)//left
         {
            
             if(x[j]==a)
             {                 
                 continue outer;
             } 
            }
         for(int j=i;j<=9;j++)//right
         {
             if(x[j]==a)
            {
                 count++;
            } 
         }     
          
           if(count==1 )//no repeatition
           {
               y[i]=a;
               
            }
        }
        for(int i=0;i<=9;i++)
        {
            
                if(y[i]!=0)
                {
                System.out.println("unique elements are:");
                System.out.println(y[i]);
            }
        }
    }
                              
    }