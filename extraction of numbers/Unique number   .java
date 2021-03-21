import java.util.Scanner;
public class unique
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int res=0,sum=0,i=0,a=0,n=0,count=0;
        for(i=0;i<10;i++)// digits from 0 to 9
        {                // check again and agian for the number in the for loop
            count=0;     
            n=num;      
            while(n>0)
            {
             res=n%10;
             n=n/10;
             if(res==i) 
             {
                count++;
             }
             if(count>a)
             {
                a=count;
             }
            }
         
        }
        if(a>1)
        {
            System.out.println("not unique");
        }
        else
        {
            System.out.println("unique number");
        }
    }
}
