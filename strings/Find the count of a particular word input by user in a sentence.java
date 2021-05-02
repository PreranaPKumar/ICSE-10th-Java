import java.util.Scanner;
public class string22
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string");
       String str=sc.nextLine();
        System.out.println("enter a word");
       String wo=sc.nextLine();
       int l=str.length();
       str=str+" ";
       String temp="";
       char ch;  
       int count=0;
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
              
                if(temp.equals(wo))
                {
                    count++;
                }
                temp=""; // make the current word empty 
            }
                      
        }
        System.out.println("count: "+count);
        }
    }
        /*
        //"today is a wonderful day "
import java.util.*;
public class samplestringextract
{
    public static void main()
    {
        System.out.println("Enter a sentence :");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str+" ";
        String temp="";
        maxword="";
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                temp=temp+ch;// forming a word 
            
if(ch==' ')
            {
                //process the extracted word
              
                if(temp.charAt(0)=='a'||temp.charAt(0)=='A')
                {
                    System.out.println(temp+ " ");
                }
                temp=""; // make the current word empty 
            }
                      
        }
        
    }*/