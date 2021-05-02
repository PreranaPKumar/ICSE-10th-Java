import java.util.Scanner;
public class string15
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence in uppercase");
       String str=sc.nextLine();
       char a,b;
       int l=str.length();
       int count=0;
       outer:for(int i=0;i<=l-1;i++)
        {
         a=str.charAt(i);
         count=0;
         for(int j=0;j<i;j++)
         {
              b=str.charAt(j);
             if(i==j)
             {                 
                 continue outer;
             } 
            }
         for(int j=i;j<=l-1;j++)//right
         {
              b=str.charAt(j);
             if(b==a)
            {
                 count++;
            } 
         }     
         
                
                  
           if(count>1)
           {
               System.out.println("the frequency of "+a+" is "+count);
               
            }
            }
        }
    }