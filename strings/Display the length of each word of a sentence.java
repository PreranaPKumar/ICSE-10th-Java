import java.util.Scanner;
public class string23
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
       for(int i=0;i<=l;i++)
       {
             ch = str.charAt(i);
            if(ch!=' ')
            {
                temp=temp+ch;// forming a word 
            }
                    if(ch==' ')
            {
                //process the extracted word
              
                System.out.println("the length of "+temp+" is: "+temp.length());
                temp=""; // make the current word empty 
            }
                      
        }
       
        }
    }