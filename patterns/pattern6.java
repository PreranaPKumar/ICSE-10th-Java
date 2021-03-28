/*1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15*/

import java.util.*;
public class pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0,x=1;
        for(i=1;i<=5;i++)// rows
        {
            for(j=1;j<=i;j++)//column
            {
                System.out.print(x+" ");
                x++;
                
            }
            System.out.println();
        }
        
    }
}
