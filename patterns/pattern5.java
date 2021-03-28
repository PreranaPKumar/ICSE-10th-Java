/*11111
2222
333
44
5*/

import java.util.*;
public class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        for(i=1;i<=5;i++)// rows
        {
            for(j=5;j>=i;j--)//column
            {
                System.out.print(i);
                
            }
            System.out.println();
        }
        
    }
}
