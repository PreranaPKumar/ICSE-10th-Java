import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int sum=0,res=0,count=0;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            if(res==6)
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
