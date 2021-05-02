import java.util.Scanner;
public class str29
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=a+" ";
        String temp="";
        int count=0;
        char fl='\u0000';
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(count==0)
            fl=b;
            if(b!=' ')
            {
                temp=temp+b;
                count++;
            }
            if(b==' ')
            {
                char ll=temp.charAt((temp.length()-1));
                System.out.println(temp+" firstletter: "+fl+"  lastletter: "+ll);
                temp="";
                count=0;
            }
        }
    }
}