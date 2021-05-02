

 import java.util.Scanner;
public class array6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0,pro=1;
        System.out.println("enter 10 digits");
        for( i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
         for(i=0;i<=9;i++)
        {
            
            pro=pro*x[i];
            i++;
        }
        System.out.println("the product of alternate elements is  "+pro);
    }
}
