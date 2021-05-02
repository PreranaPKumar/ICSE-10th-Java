
import java.util.Scanner;
public class array12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0,max=0,min=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a number");
            x[i]=sc.nextInt();
            if(x[i]>max)
            {
                max=x[i];
            }
         }
          min=max;
          for(i=0;i<=9;i++)
         {
            if(x[i]<min)
            {
                min=x[i];
            }
        }
        System.out.println("the largest element is  "+max);
        System.out.println("the smallest element is "+min);
    }
}
