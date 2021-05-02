import java.util.Scanner;
public class string11
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a sentence in uppercase");
       String str=sc.next();
       int i=0,count=0;
       int l=str.length();
       String c="";
       int a,e=0;
       for(i=0;i<l-1;i++)
       {
           char ch= str.charAt(i);
           if(ch =='A'||  ch=='I'||ch=='E'||ch=='O'||ch=='U')
           {
               e=i-1;
               for(int j=i;j<=l-1;j++)
               {
                   char ab=str.charAt(j);
                   c=c+ab;
                }
                break;
            }
        }
        for(i=0;i<=e;i++)
       {
           c=c+str.charAt(i);
        }
        System.out.println("pig latin word: "+c+"AY");
        }
    }