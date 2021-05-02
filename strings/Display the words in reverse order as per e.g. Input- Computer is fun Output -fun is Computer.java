import java.util.Scanner;
public class string26
{
   
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
       int l=str.length();
       str=" "+str+" ";
       String temp="",rev="";
       char ch;
       int count=0,count1=0,le;
       for(int i=l;i>=0;i--)
       {
             ch = str.charAt(i);
            if(ch!=' ')
            {
                temp=temp+ch;// forming a word 
            }             
            if(ch==' ')
            {
                //process the extracted word
                le=temp.length();
                 for(int j=le-1;j>=0;j--)
               {
                   ch=temp.charAt(j);
                   rev=rev+ch;
                }
                   
                    System.out.print(rev+" ");
                
                    temp="";
                    rev="";
            }
            
        }
    }
}
            
            
        
       
        
    