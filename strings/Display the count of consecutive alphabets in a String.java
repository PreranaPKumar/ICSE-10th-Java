import java.util.Scanner;
public class string9
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence");
       String str=sc.next();
       int i=0,count=0;
       int l=str.length();
       char a,b;
       for(i=0;i<=(l-2);i++)
       {
           a=str.charAt(i);
           b=str.charAt(i+1);
           if(b-a==1)
           count++;
        }
         System.out.println("count"+count);
        }
    }