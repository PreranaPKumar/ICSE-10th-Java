import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        double sum=0,res=0;
        int i,a=1,x=1,y=2,z=1;
        for(i=1;i<=n;i++)
        {
          a=x*y*a;
          res=res+a;
          sum=sum +(z/res);
          z=z+2;
          
          x=y+1;
          y=x+1;
        }
        System.out.println("the sum of the terms is   "+sum);
    }
}
