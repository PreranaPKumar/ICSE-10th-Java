import java.util.Scanner;
public class str35
{ 
     public static void main(String args[])
     {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        String temp="",c="";
        a=a+" ";
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                    temp=temp+b;
                }
                if(b==' ')
                {
                    c=temp.charAt(0)+""+temp.charAt(temp.length()-2)+temp.substring(2,temp.length()-2)+temp.charAt(1)+temp.charAt(temp.length()-1);
                    System.out.println(c);
                    temp="";
                    c="";
                }
            }
       
     }
}