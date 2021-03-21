import java.util.Scanner;

public class NivenNumber
{
    public static void main(String[] args)
    {
        
        int n, num, res,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            res = num % 10;
            sum = sum + res;
            num = num / 10;
        }
        if (n % sum == 0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not Niven Number");
        }
    }
}