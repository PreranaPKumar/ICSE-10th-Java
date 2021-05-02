import java.util.Scanner;
public class str37
{ 
     public static void main(String args[])
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        String temp="",c="";
        a=a+" ";
        int max=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                    temp=temp+b;
            }
            if(b==' ')
            {
                if(temp.length()>max)
                {
                    max=temp.length();
                    c=temp;
                }
                temp="";
            }
        }
        System.out.println(c);
    }
}