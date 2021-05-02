import java.util.Scanner;
public class function2
{
    boolean prime(int a)
    { int count=0;
       
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            count++;
        }
        if(count==2)
        return true;
        else
        return false;
    }
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        function2 obj=new function2();
        
        System.out.println("enter a number");
        int num=sc.nextInt();
        boolean x=obj.prime(num);
       
        if(x==true)
        System.out.println("it is prime");
        else
        System.out.println("it isnt prime");
    }
}
    
    