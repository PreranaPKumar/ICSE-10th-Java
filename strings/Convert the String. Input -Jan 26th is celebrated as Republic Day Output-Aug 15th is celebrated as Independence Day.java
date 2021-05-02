import java.util.Scanner;
public class str36
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.nextLine();
        a=a+" ";
        String c="Jan",d="26th",e="Republic",f="",temp="";
        for(int i=0;i<=(a.length()-1);i++)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                temp=temp+b;
            }
            if(b==' ')
            {
                System.out.println(temp);
                if(temp.equals(c))
                f=f+" Aug";
                else if(temp.equals(d))
                f=f+" 15th";
                else if(temp.equals(e))
                f=f+" Independence";
                else
                f=f+" "+temp;
                temp="";
            }
        }
        System.out.println(f);
    }
}