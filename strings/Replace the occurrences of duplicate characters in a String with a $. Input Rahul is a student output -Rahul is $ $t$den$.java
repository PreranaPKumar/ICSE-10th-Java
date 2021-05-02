import java.util.Scanner;
public class str40
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.next();
        String g="";
        int count=0,count1=0;
        char c='\u0000';
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            for(int j=0;j<=(a.length()-1);j++)
            {
                c=a.charAt(j);
                if(b==c)
                count++;
            }
            for(int x=0;x<i;x++)
            {
                char d=a.charAt(x);
                if(b==d); //counts nos. at the left of i
                else
                {
                    count1++;
                }
            }
            if(i==count1) // if count1< i then a no. repeated
            {
                g=g+b;
            }
            else
            g=g+'$';
            count=0;
            count1=0;
        }
        System.out.println(g);
    }
}