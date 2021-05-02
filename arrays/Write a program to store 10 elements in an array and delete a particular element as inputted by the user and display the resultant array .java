import java.util.Scanner;
public  class array34
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0,count=0;
        for(i=0;i<=9;i++)
        {
            System.out.println("Enter a element");
            x[i]=sc.nextInt();
        }
        System.out.println("Enter a position between 0 to 9");
        i=sc.nextInt();
        x[i]=0;
        System.out.println("the array is");
        for(i=0;i<=9;i++)
        {
            System.out.println(x[i]);
        }
    }
}
            
            
        