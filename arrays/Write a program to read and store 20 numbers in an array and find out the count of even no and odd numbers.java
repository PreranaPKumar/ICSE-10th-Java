
import java.util.Scanner;
public class array1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int x[]=new int[20];
        int counteven=0,countodd=0;
        System.out.println("Enter 20 numbers");
        for(i=0;i<=19;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<=19;i++)
        {
            if(x[i]%2==0)
            {
                counteven++;
            }
            else
            {
                countodd++;
            }
        }
        System.out.println("the number of even digits are"+counteven);
        System.out.println("the number of odd digits are"+countodd);
        
    }
}
