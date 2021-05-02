import java.util.Scanner;
public class array21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int [10];
        int i=0,temp=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a element");
            x[i]=sc.nextInt();
        }
        temp=x[0];
        x[0]=x[9];
        x[9]=temp;
        System.out.println("the values after swapping the first and last elememt are:");
        for(i=0;i<=9;i++)
        {
            System.out.println(x[i]);            
        }
    }
}
        