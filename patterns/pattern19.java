/*Output:
555555555
 4444444
  33333
   222
    1 */
import java.util.Scanner;
public class Pattern35
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 5 - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}