/*5
44
333
2222
11111*/

import java.util.*;
public class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        for(i=5;i>=1;i--)// rows
        {
            for(j=5;j>=i;j--)//column
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
}
