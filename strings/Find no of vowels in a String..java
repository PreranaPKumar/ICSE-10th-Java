import java.util.Scanner;
public class string4
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a word in uppercase");
       String str=sc.next();
       int i=0,count=0;
       int l=str.length();
       for(i=0;i<=l-1;i++)
       {
           if(str.charAt(i) =='A'||  str.charAt(i)=='I'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U')
           {
            count++;           
            }
        }
        System.out.println("number of vowels are: "+count);
    }
}