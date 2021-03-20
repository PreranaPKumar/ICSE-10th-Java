import java.util.Scanner;
public class marks_10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        int marks=sc.nextInt();
        int i,b,c,count=0;
        for(i=1;i<=4;i++)
        {
            System.out.println("enter the marks");
            c=sc.nextInt();
            if(c>marks)
            {
                marks=c;
            }
        }
        
        System.out.println(marks);
    }
}
