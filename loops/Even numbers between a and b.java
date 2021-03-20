
import java.util.Scanner;
public class xy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a starting num ");
        int a=sc.nextInt();
        System.out.println("enter a ending num  ");
        int b=sc.nextInt();
        int i;
        for(i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
                
            }
            
        }
     System.out.println("these are the even numbers between a and b");    
    }
    
}
