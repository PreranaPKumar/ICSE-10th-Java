import java.util.Scanner;
public class array38
{
    public static void main(String args[])
    {
        // 1 2 3 4 5
        // 4 5 1 2 3 
        Scanner sc=new Scanner(System.in);
        int x[]=new int[5];
        int y[]=new int[5];
        int a=0,count;
        array38 obj=new array38();
        for(int i=0;i<=4;i++)
        {
            System.out.println("Enter a element");
            x[i]=sc.nextInt();                   
         }
         System.out.println("Enter the rotation");
            int r=sc.nextInt(); 
            int i=0;
            for(int k=1;k<=r;k++)
            {
             obj.r(x);
            }
                for(int n=0;n<=4;n++)
        {
            System.out.println("after the rotation:" +x[n]);                               
         }
    }
   void r( int a[])
    {
        int i=0;
        int temp=a[4];
        for(i=4;i>=1;i--)
         {             
             a[i]=a[i-1];
        }
        a[0]=temp;
            }
}
             
             
             
             