 
import java.util.Scanner;
public class array15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String  x[]=new String[10];
        int i =0,count=0;
        char a;
        for(i=0;i<=9;i++)
        {
            System.out.println("enter a name");
            x[i]=sc.nextLine();
            a=x[i].charAt(0);
            if(a=='a'||a=='A')
            {
                count++;
            }
        }    
        System.out.println("the count of names starting with the letter 'A' is  "+count);
    }
}
