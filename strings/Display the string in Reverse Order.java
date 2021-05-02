import java.util.Scanner;
public class string2
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a word");
       String str=sc.next();
       int l=str.length();
       String rev="";
       char ch;
       for(int i=l-1;i>=0;i--)
       {
           ch=str.charAt(i);
           rev=rev+ch;
        }
        System.out.println("reversed  word  "+rev);
        }
    }