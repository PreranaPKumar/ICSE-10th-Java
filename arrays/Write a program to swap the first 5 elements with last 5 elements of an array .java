import java.util.Scanner;
public class array37
{
    public static void main(String args[])
    {
        // 1 2 3 4 5
        // 4 5 1 2 3 
        Scanner sc=new Scanner(System.in);
        int x[]=new int[5];
        int y[]=new int[5];
        int a=0,count;
        for(int i=0;i<=4;i++)
        {
            System.out.println("Enter a element");
            x[i]=sc.nextInt();                   
         }
         System.out.println("Enter the rotation");
            int r=sc.nextInt(); 
            int i=0;
         while(i>=0 && i<=4 )
         {
             int j=0;
             if(i+r<=4)
             {
                 y[i+r]=x[i];
                 
                }
              else if(i+r >4)
              {
                 y[j]=x[i];
                 j++;
                }
                 i++; 
                 
                }
                for(int n=0;n<=4;n++)
        {
            System.out.println("after the rotation:" +y[n]);                               
         }
    }
}
             
             
             
             