import java.util.Scanner;
public class str31
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= sc.nextLine();
        a=" "+a;
        String temp="",in="",fina="",abb="";
        int count=0,count1=0,ab=0;
        for(int i=(a.length()-1);i>=0;i--)
        {
            char b=a.charAt(i);
            if(b!=' ')
            {
                temp=b+temp;
                count++;
            }
            if(b==' ')
            {
                count1++;
                if(count1==1)
                {
                    fina=fina+temp;
                    ab=1;
                }// last name
                else
                {
                    ab=0;
                    char c=temp.charAt(0);
                    abb=c+"."+abb;
                }
                
                temp="";
                count=0;
            }
        }
        System.out.println(abb+" "+fina);
    }
}