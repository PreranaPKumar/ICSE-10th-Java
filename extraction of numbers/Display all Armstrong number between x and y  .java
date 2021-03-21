import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a starting number");
        int x=sc.nextInt();
        System.out.println("enter a ending number");
        int y=sc.nextInt();
        int res=0,i,num=0;
        double sum=0;
        for(i=x;i<=y;i++)//to find number btween x and y
        {
            num=i;  
            sum=0;
            for(;num!=0;)
            {
                res=num%10;
                num=num/10;
                sum=sum+(Math.pow(res,3));
            }
            if(sum==i)
            {
                System.out.println("armstong number "+i);           
            }            
      }    
    }
}
