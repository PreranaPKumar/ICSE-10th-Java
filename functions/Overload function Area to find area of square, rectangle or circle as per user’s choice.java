import java.util.Scanner;
public class function5
{
    void area(int s)
    {
        int A=s*s;
        System.out.println("The area of square is" +A);
    }
    void area(double r)
    {
        double A= Math.PI *r*r;
        System.out.println("The area of circle is  is" +A);
    }
    void area(int l, int b)
    {
        int A=l*b;
        System.out.println("The area of rectangle is" +A);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        function5 obj= new function5();
        int res;
        System.out.println("CHOOSE THE OPTION:\n1.Square\n2.Rectangle\n3.Circle");
        int op=sc.nextInt();
        switch(op)
        {
            case 1:
            System.out.println("Enter the side of square");
            int side=sc.nextInt();
             obj.area(side);
            break;
            case 2:
            System.out.println("Enter the length and breadth of rectangle");
            int len=sc.nextInt();
            int br=sc.nextInt();
             obj.area(len,br);
            break;
            case 3:
            System.out.println("Enter the radius of the circle");
            double radius=sc.nextInt();
             obj.area(radius);
            break;
            default:
            System.out.println("INVALID CHOICE");
            System.exit(0);
            break;
        }
    }
}