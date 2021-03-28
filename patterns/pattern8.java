/*ABCDE
ABCD
ABC
AB
A*/
import java.util.Scanner;
public class abc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        for(char i='E';i>='A';i--)
        {
            for(char j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
