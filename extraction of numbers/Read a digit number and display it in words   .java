import java.util.Scanner;
public class name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int res=0,sum=0,rev=0,num=0;
        while(a>0)
        {
            num=a%10;
            rev=rev*10+num;
            a=a/10;
        }
        System.out.println(rev);
        while(rev>0)
        {
            res=rev%10;
            rev=rev/10;
            if(res==0)
            {
                System.out.println("zero");
            }
            else if(res==1)
            {
                System.out.println("one");
            }
            else if(res==2)
            {
                System.out.println("two");
            }
            else if(res==3)
            {
                System.out.println("three");
            }
            else if(res==4)
            {
                System.out.println("four");
            }
            else if(res==5)
            {
                System.out.println("five");
            }
            else if(res==6)
            {
                System.out.println("six");
            }
            else if(res==7)
            {
                System.out.println("seven");
            }
            else if(res==8)
            {
                System.out.println("eight");
            }
            else if(res==9)
            {
                System.out.println("nine");
            }
            
        }
    }
}
