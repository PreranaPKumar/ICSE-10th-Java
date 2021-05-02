import java.util.Scanner;
public class string12
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence in uppercase");
       String str=sc.nextLine();
        System.out.println("enter 2 positions");
        int p1=sc.nextInt();
        int p2=sc.nextInt();       
       int i=0,count=0;
       int l=str.length();
       String a="";
       char ch=str.charAt(p1);
       char ch2=str.charAt(p2);
       for(i=0;i<=l-1;i++)
       {
           if(i==p1)
           a=a+ch2;
           else if(i==p2)
           a=a+ch;
           else
           a=a+str.charAt(i);
        }
         System.out.println("new sentence "+a);
        }
    }
           