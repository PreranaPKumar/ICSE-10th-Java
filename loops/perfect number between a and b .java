import java.util.Scanner;
public class perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a starting number");
        int a=sc.nextInt();
        System.out.println("enter a ending number");
        int b=sc.nextInt();
        int i,j,sum=0;
        for(i=a;i<=b;i++)//find number between a and b
        {
            sum=0;
            for(j=1;j<b;j++)//factors
            {
                if(i%j==0)//to check for factor
                {
                    sum=sum+j;
                }
                  if(sum==i)//to check if its perfect
                {
                  System.out.println(i);
                }
            }
           
        }   
        
    }
}
