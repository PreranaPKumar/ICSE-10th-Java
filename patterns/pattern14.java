 /* 1
   12
  123
 1234
12345  */
import java.util.Scanner;
public class Pattern23
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5 - i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}