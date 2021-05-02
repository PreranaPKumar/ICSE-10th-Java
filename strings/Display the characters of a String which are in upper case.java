import java.util.Scanner;
public class string3
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a word");
       String str=sc.next();
       int i=0;
       int l=str.length();
       for(i=0;i<=l-1;i++)
       {
           if(str.charAt(i) >='A' && str.charAt(i) <='Z')
           {
            System.out.println("upppercase "+str.charAt(i));            
            }
        }
    }
}