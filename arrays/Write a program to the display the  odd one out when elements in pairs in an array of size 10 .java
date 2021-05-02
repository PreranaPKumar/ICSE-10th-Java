import java.util.Scanner;
public class oddArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[11];
        int i=0,count=0,sample=0;
        for(i=0;i<=10;i++)
        {
            System.out.println("enter elements in pairs ");
            x[i]=sc.nextInt();
        }
        for(i=0;i<=10;i++)
        {            
            count=0;
            for(int j=0;j<=10;j++)
            {
                if(x[i]==x[j])
                {
                    count++;
               }
                             
            }
            if(count!=2)
                {
                   sample=x[i];
                   System.out.println("the odd one out is:  "+sample);     
                   break;
                }  
            
        }
    }
}
                    