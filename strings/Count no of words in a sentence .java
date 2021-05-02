import java.util.Scanner;
public class string6
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence");
       String str=sc.nextLine();
       int i=0,count=1,l;    
       char ch;
       l=str.length();
       for(i=0;i<=l-1;i++)
       {
           ch=str.charAt(i);
           if(ch==' ')
           count++;
        }
        System.out.println("number of words: "+count);
    }
}
        