import java.util.Scanner;
public class factors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int i;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println(i);
            }
            
        }
        System.out.println("these are the factors the number given");
    }
}

 
