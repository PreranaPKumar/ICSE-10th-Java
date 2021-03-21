import java.util.Scanner;

public class HappyNumber
{
    public static void main(String[] args)
    {
        int n, res = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                res = num % 10;
                sum = sum + (res * res);
                num = num / 10;
            }
            num = sum;
            
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
    }
}