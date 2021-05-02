import java.util.Scanner;
public class array28
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int y[]=new int[10];
        int m[]=new int[20];
        int i=0,j=10;
        for(i=0;i<=9;i++)
        {
          System.out.println("enter elements of array A");
          x[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
          System.out.println("\n \nenter elements of array B");
          y[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            m[i]=x[i];
        }
        for(i=0;i<=9;i++)
        {
            m[j]=y[i];
            j++;
        }
        System.out.println("the elements in the merged array C are:");
        for(i=0;i<=19;i++)
        {
            System.out.println(m[i]);
        }
    }
}

        