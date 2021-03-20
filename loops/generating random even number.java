import java.util.Scanner;
public class test
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
         //range is 18 but to get even we set range to half then multiply by 2 to get even number
         int sum=(int)(Math.floor(Math.random()*9)+1);
         sum=sum*2;
         System.out.println(sum);
        }
 } 
