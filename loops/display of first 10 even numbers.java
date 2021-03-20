Display of first 10 even numbers
import java.util.Scanner;
public class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("the even no. between 1 to 10 are ");
        int i;
        for(i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
      }
            
