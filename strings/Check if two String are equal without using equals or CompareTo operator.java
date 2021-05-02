import java.util.Scanner;
public class string13
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence in uppercase");
       String str=sc.nextLine();
        System.out.println("enter a sentence in uppercase");
       String str1=sc.nextLine();
       int l=str.length();
       char a,b;
       for(int i=0;i<=l-1;i++)
       {
           a=str.charAt(i);
           b=str1.charAt(i);
           if(a==b);
           
           else
           {
               System.out.println("they are not equal");
               break;
               
        }
        }
        }
    }
       