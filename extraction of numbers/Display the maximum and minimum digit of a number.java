import java.util.Scanner;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit");
        int num=sc.nextInt();
        int res=0,max=0,min=9;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            if(res>max)
            {
                max=res;
            }
            if(res<min)
            {
                min=res;
            }
        }
        System.out.println("the maximum digit is "+max);
        System.out.println("the minimum digit is "+min);
    }
}
