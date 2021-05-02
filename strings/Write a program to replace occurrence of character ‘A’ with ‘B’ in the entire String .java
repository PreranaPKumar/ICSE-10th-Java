import java.util.Scanner;
public class string19
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence in uppercase");
       String str=sc.nextLine();
            
       int i=0,count=0;
       int l=str.length();
       String a="";
       char ch='A';
       char ch2='B';
       char ab;
       for(i=0;i<=l-1;i++)
       {
           ab=str.charAt(i);
           if(ab=='A')
           a=a+ch2;
           else if(ab=='B')
           a=a+ch;
           else
           a=a+str.charAt(i);
        }
         System.out.println("new sentence "+a);
        }
    }
           