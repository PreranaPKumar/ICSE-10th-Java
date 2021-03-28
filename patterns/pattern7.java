/*222222
   4444
    666
     88
     10 */
import java.util.Scanner;
public class afg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=2;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x);
            }
            x=x+2;
            System.out.println();
        }
    }
}
