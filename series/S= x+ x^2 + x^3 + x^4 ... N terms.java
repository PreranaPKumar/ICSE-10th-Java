import java.util.Scanner;
public class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //x +x^2 +x^3 +x^4...n terms
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        int y=1,i;
        double sum=0;
        for(i=1;i<=n;i++)
        {
            sum=sum+(Math.pow(x,y));
            y=y+1;
            
        }
        System.out.println("the sun the terms is  "+sum);
        
    }
}
