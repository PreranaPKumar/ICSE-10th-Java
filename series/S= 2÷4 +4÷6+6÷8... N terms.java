import java.util.Scanner;
public class fraction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //  2/4+ 4/6 +6/8 ...n terms
        System.out.println("enter the number of terms");
        int a=sc.nextInt();
        double x=2,y=4,i,sum=0;
        
        for(i=1;i<=a;i++)
        {
            sum=sum+x/y;
            x=x+2;
            y=y+2;
        }
        System.out.println("the sum of the terms are  "+sum);
    }
}
