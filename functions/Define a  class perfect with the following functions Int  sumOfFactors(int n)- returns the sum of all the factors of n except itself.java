import java.util.Scanner;
public class function7
{
    
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        function7 obj=new function7();
        int j=0;
        boolean res=false;
        System.out.println("enter a number");
        int num=sc.nextInt();
        obj.display(num);
           
    
}
    void display(int x) 
    {
         
        int i,j=0;
        boolean b,res;
        
            
        //loop
        for(i=1;i<=x;i++)
        {
         b=isPerfect(i);
         if(b==true)
            {
             System.out.print("\n"+i+ " {");
             for(j=1;j<i;j++)
             {
                 if(i%j==0)
                 {
                     System.out.print(j+" ,");
                    }
                }
                System.out.println( " }");
            }
         
        }
         
            
                
    }
    int sumOfFactors(int n)//  returns the sum of all the factors of n except itself
    {
        int sum=0,b;
        
        for(b=1;b<n;b++)
        {
            if(n%b==0)
            {
                sum=sum+b;
                
            }                
        }
        return sum;
    }
    boolean isPerfect(int n)  //  Returns true if n is perfect else false. 
    {
        
        int sum=sumOfFactors(n);
        if(sum==n)
        return true;
        else 
        return false;
    }
}
