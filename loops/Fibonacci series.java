import java.util.Scanner;
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("fibonacci  series");
        int a,c,b=1,count=0;
        System.out.println(b);
        for(a=1;a<10946;a++)
        {
            
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
            count=count+1;
            if(count==20)
            {
                break;
            }
        }
    }
}
