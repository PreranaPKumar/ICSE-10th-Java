import java.util.Scanner;
public class string21
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
       int l=str.length();
       char ch;
       String n="";
       for(int i=0;i<=l-1;i++)
       {
        ch=str.charAt(i);
        if(ch>='a' && ch<='z')
        { 
         int a=(int)ch;
         a=a-32;
         ch= (char)a;
        }
        else if(ch>='A' && ch<='Z')
        { 
         int a=(int)ch;
         a=a+32;
         ch= (char)a;
        }
        n=n+ch;
    }
    System.out.println("new string: "+n);
}
}
         