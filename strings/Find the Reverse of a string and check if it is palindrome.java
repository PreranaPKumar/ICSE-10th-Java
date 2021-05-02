import java.util.Scanner;
public class string20
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
       int l=str.length();
       String rev="";
       char ch;
       for(int i=l-1;i>=0;i--)
       {
           ch=str.charAt(i);
           rev=rev+ch;
        }
        if(rev.equals(str))
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
        }
    }