import java.util.Scanner ;
public class extract
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        int dig=0,res=0;
        while(num!=0)
        {
            res=num%10;
            num=num/10;
            if(res%2==0 && res%4==0)
            {
                dig=res;
            }
            System.out.println(dig);
        }
        
    }
}
