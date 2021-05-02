import java.util.Scanner;
public class str28
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=a+" ";
        int count=0,count1=0;
        String temp="";
        for(int i=0;i<=(a.length()-1);i++) // first letter-->whole word
        {
            char b=a.charAt(i);
            if((b=='a' ||b=='A') && count1==0)
            {
                count=1;
                char c=a.charAt(i);
            }
            if(b!=' ')
            {
                if(count==1)
                {
                    temp=b+temp;
                    count=1;
                }
                else
                temp=temp+b;
                count1++;
            }
            if(b==' ')
            {
                System.out.print(temp+" ");
                temp="";
                count=0;
                count1=0;
            }
        }
    }
}