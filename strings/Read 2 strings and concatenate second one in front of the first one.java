import java.util.Scanner;
public class string18
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
       System.out.println("enter a string");
       String str2=sc.nextLine();
       String c=str+str2;
       System.out.println("concatinated string: "+c);
    }
}