import java.util.Scanner;
public class function9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        function9 obj= new function9();
        boolean p;
        for(int i=num+1;;i++)
        {
            p=obj.prime(i);
            if(p==true)
            {
                System.out.println(" the next prime number after the given number is :"+i);
                break;
            }
          
            
        }
        
    }
    boolean prime(int num)
     {
        int count=0;
        for(int j=1;j<=num;j++)
        {
            if(num%j==0)
            count++;
        }
        if(count==2)
        return true;
        else
        return false;
    }
}