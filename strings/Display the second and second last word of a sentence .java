import java.util.Scanner;
public class string24
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
       int count=0,count1=0;
       for(int i=0;i<=l;i++)
       {
             ch = str.charAt(i);
            if(ch!=' ')
            {
                temp=temp+ch;// forming a word 
            }
             if(ch==' ')
            {
                count1++;
            }
            if(ch==' ')
            {
                //process the extracted word
                count++;
                   if(count==2 ||count==count1-2)
                   {
                    System.out.println(temp);
                    
                   }
                    temp=""; // make the current word empty 
            }
            
        }
    }
}
            
            
        
       
        
    