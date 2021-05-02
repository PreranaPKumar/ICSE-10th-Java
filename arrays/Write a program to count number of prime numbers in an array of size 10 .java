import java.util.Scanner;
public class array22
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int [10];
        int i=0,count=0,countP=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a element");
            x[i]=sc.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            count=0;
            for(int j=1;j<=x[i];j++)
            {
                if(x[i]%j==0)
                {
                    count++;
                }
            }        
                
            if(count==2)
            {
                System.out.println("prime  "+x[i]);
                countP++;                
            }
        }
        System.out.println("count of prime numbers: "+countP);
        }
    }