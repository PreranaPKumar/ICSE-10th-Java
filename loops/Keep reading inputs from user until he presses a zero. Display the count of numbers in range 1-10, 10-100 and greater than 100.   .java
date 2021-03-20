import java.util.Scanner;
public class input
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a,b=1,j,count_1=0,count_2=0,count_3=0;
        for(i=1;i>=1;i++)
        {
            System.out.println("enter a number");
            a=sc.nextInt();
            if(a==0)
            {
                System.out.println("you entered zero");
                b=0;
            }
            if(b==0)
            break;
            if(a>=1 && a<=10)
            {
                count_1=count_1+1;
                
            }
            else if(a>10 && a<=100)
            {
                count_2=count_2+1;
            }
            else if(a>100 && a<=1000)
            {
                count_3=count_3+1;
            }
        }
        System.out.println("the number of digits in ones are  "+count_1);
        System.out.println("the number of digit in tens are  "+count_2);
        System.out.println("the nuumber of digits in hundreds are  "+count_3);
    }
}
