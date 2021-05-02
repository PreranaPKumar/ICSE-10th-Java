import java.util.Scanner;
public class array19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[5];
        int c[]=new int[15];
        int i=0,j=10;
        for(i=0;i<=9;i++)
        {
          System.out.println("enter elements of array A");
          a[i]=sc.nextInt();
        }
        for(i=0;i<=4;i++)
        {
          System.out.println("\n \nenter elements of array B");
          b[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            c[i]=a[i];
        }
        for(i=0;i<=4;i++)
        {
            c[j]=a[i];
            j++;
        }
        System.out.println("the elements in the merged array C are:");
        for(i=0;i<=14;i++)
        {
            System.out.println(c[i]);
        }
    }
}

        