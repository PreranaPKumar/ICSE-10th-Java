import java.util.Scanner;
public class string27
{
   
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
       int l=str.length();
       str=str+" ";
       String temp="",s="";
       char ch,ca;
       int count=0;
       String rev="";
       int le=0,a=0,x=0;
       for(int i=0;i<=l;i++)
       {
             ch = str.charAt(i);
            if(ch!=' ')
            {
                 if(count==0)
                 {
                  a=(int)ch;
                   if(ch>='a' && ch<='z')
                   {
                            a=a-32;                            
                    }
                   else if(ch>='A' && ch<='Z')
                   {
                           a=a+32;                            
                    }
                    ch=(char)a;
                }
                temp=temp+ch;
                 count++;
            }
             if(ch==' ')
            {
                System.out.print(temp);
                
                    temp="";
                    count=0;// make the current word empty 
            }
            
        }
    }
}
            
            
        
       
        
    