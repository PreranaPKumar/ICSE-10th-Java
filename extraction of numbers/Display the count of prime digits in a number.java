import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int res=0,count=0;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            if(res==2 || res==3 || res==5 || res==7)
            {
                count=count+1;
            }
        }
        System.out.println("count of prime number is  "+count);
    }
}
