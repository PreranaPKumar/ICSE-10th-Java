import java.util.Scanner;
public class str30
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=a+" ";
        String temp="";
        int count=0;
         for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                if(b=='a' || b=='A')
                count=1;
                temp=temp+b;
            }
            if(b==' ')
            {
                if(count==1)
                System.out.println(temp);
                temp="";
                count=0;
            }
        }
    }
}