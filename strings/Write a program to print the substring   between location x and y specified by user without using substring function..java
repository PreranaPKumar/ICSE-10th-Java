import java.util.Scanner;
public class string17
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
       System.out.println("enter 2 positions");
       int p1=sc.nextInt();
       int p2=sc.nextInt();
       String sub="";
       char ch;
       for(int i=p1;i<=p2;i++)
       {
           ch=str.charAt(i);
           sub=sub+ch;
        }
       System.out.println("sub string "+ sub);
    }
}
       