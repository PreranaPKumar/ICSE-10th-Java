import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int res=0;
        if(res==7 || num%7==0)
        {
            System.out.println("buzz number");
        }
        else
        {
            System.out.println("not a buzz number");
        }
    }
}
