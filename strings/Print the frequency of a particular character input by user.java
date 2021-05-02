import java.util.Scanner;
public class string14
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence in uppercase");
       String str=sc.nextLine();
        System.out.println("enter character");
       char ch=sc.next().charAt(0);
       int l=str.length();
       char a,b;
       int count=0;
       for(int i=0;i<=l-1;i++)
       {
           a=str.charAt(i);
           if(a==ch)
           count++;
        }
        System.out.println("count of charater: "+count);
        
    }
    }

       