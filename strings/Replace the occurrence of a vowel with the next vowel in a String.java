import java.util.Scanner;
public class string10
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence");
       String str=sc.nextLine();
       int i=0,count=0;
       int l=str.length();
       String c="";
       int a;
       for( i=0;i<=(l-1);i++)
        {
            char b=str.charAt(i);
            
            if( b=='A' || b=='a')  
            {
                 b='e';
            }
            else if(b=='E' || b=='e')
            {
                b='i';
            }
            else if(b=='I' || b=='i')
            {
                b='o';
            }
            else if(b=='o' || b=='O')
            {
                b='u';
            }
            else if(b=='U' || b=='u')
            {
                b='a';
            }
            
            c= c+b;
        }
        System.out.println(""+c);
        }
    }