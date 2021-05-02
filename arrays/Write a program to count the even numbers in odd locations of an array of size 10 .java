import java.util.Scanner;
public class array20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int [10];
        int i=0,count=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a element");
            x[i]=sc.nextInt();
        }
        for(i=1;i<=9;i=i+2)
        {            
                if(x[i] %2==0)
                {
                    count=count+1;
                    //System.out.println("i"+i);
                    //System.out.println("x"+x[i]);                    
                }                
        }
        System.out.println("the count of even numbers in odd locations are:" +count);
    }
}
        