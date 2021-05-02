import java.util.Scanner;
public class string5
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a word");
       String str=sc.next();
       int i=0,countu=0,count=0;
       int l=str.length();
       for(i=0;i<=l-1;i++)
       {
           if(str.charAt(i) >='A' && str.charAt(i) <='Z')
           {
            countu++;          
            }
            else if(str.charAt(i) >='a' && str.charAt(i) <='z')
            count++;
        }
        System.out.println("count of uppercase: "+countu+"\ncount of lowercase: "+count);
    }
}