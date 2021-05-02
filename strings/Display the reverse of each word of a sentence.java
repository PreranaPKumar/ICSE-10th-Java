import java.util.Scanner;
public class string25
{
   
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
       int l=str.length();
       str=str+" ";
       String temp="";
       char ch;
       int count=0;
       String rev="";
       int le=0;
       for(int i=0;i<=l;i++)
       {
             ch = str.charAt(i);
            if(ch!=' ')
            {
                temp=temp+ch;// forming a word 
            }
             if(ch==' ')
            {
                le=temp.length();
                 for(int j=le-1;j>=0;j--)
               {
                   ch=temp.charAt(j);
                   rev=rev+ch;
                }
                   
                    System.out.print(rev);
                
                    temp="";
                    rev="";// make the current word empty 
            }
            
        }
    }
}
            
            
        
       
        
    