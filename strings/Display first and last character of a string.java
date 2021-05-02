import java.util.Scanner;
public class string1
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a word");
       String str=sc.next();
       int l=str.length();
       System.out.println("the first letter: "+ str.charAt(0)+"last letter: " +str.charAt(l-1));
    }
}
       
       