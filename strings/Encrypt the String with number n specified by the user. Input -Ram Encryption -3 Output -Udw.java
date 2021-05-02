import java.util.Scanner;
public class str38
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        System.out.println("enter anumber");
        int n=sc.nextInt();
        String temp="";
        a=a+" ";
        char c='\u0000';
        int d=0;
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                 d=(int)b;
                    d=d+n;
                if(d>122 || d>90)
                {
                    d=d-n;
                    d=(d%n)+97;
                }
                c=(char)d;
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