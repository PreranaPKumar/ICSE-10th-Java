/*1
12
123
1234
12345*/
import java.util.*;
public class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        for(i=1;i<=5;i++)// rows
        {
            for(j=1;j<=i;j++)//column
            {
                System.out.print(j);
            }
            System.out.println();
        }        
    }
}
