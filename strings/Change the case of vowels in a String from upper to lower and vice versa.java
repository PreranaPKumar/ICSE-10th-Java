import java.util.Scanner;
public class string8
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a word in uppercase");
       String str=sc.next();
       int i=0,count=0;
       int l=str.length();
       char ch;
       int a;
       String s="";
       for(i=0;i<=l-1;i++)
       {
           ch=str.charAt(i);
           a=(int)ch;
           if(ch =='A'||  ch=='I'||ch=='E'||ch=='O'||ch=='U')
           {
                    
                    
                    a=a+32;
                    ch=(char)a;
                    s=s+ch;
            }
           else if(ch =='a'||  ch=='i'||ch=='e'||ch=='i'||ch=='u')
           {
                   a=a-32;
                    ch=(char)a; 
                   s=s+ch;
            }
            else
            {
                s=s+ch;
            }
            
        }
        System.out.println(s);
        }
    }