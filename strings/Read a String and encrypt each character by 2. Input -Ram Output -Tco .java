import java.util.Scanner;
public class str34
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        String temp="";
        a=a+" ";
        char c='\u0000';
        int d=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                if(b=='z' || b=='Z')
                {
                    b='b';
                    c=b;
                }
                else if(b=='y' || b=='Y')
                {
                    b='a';
                    c=b;
                }
                else
                {
                    d=(int)b;
                    d=d+2;
                    c=(char)d;
                }
                temp=temp+c;
                d=0;
            }
            if(b==' ')
            {
                System.out.print(temp+" ");
                temp="";
            }
        }
    }
}