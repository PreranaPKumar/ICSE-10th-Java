import java.util.Scanner;
public class string7
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence");
       String str=sc.nextLine();
       int i=0,count=0,countd=0,counts=0,l,n=0;    
       char ch;
       l=str.length();
       for(i=0;i<=l-1;i++)
       {
           ch=str.charAt(i);
           if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')//special chracter
           {
           count++;
        }
        else if(ch>= '0' && ch<='9')
        {
            countd++;
        }
        else
        {
            counts++;
        }
    }
        System.out.println("number of digits "+countd+"\n number of special charaters: "+counts+"count of alphabets :"+count);
    }
}
        