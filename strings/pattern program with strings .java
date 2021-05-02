import java.util.Scanner;
public class str42
{ 
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String a= "PANKAJ";
        for(int i=0;i<=(a.length()-1);i++)
        {
            int x=0;
            for(int j=(a.length()-1);j>=i;j--)
            {
                System.out.print(a.charAt(x));
                x++;
            }
            System.out.println("");
        }
        String b= "PANKAJ";
        int x=0;
        for(int i=0;i<=(b.length()-1);i++)
        {
            
            for(int j=(b.length()-1);j>=i;j--)
            {
                System.out.print(a.charAt(x));
                
            }
            x++;
            System.out.println("");
        }
    }
}