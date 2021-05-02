import java.util.Scanner;
public class array24
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x[]=new String [13];
        int i=0;
        x[0]="Zero";        
        x[1]="One";   
        
        x[2]="Two";         
        x[3]="Three";
        
        x[4]="Four";    
        x[5]="Five";
        
        x[6]="Six";        
        x[7]="Seven";
        
        x[8]="Eight";        
        x[9]="Nine";
        
        System.out.println("enter single digit to display in words:");
        i=sc.nextInt();
        if(i>=0 && i<=9)
        {
            System.out.println("result:\n"+x[i]);
        }
        else
        {
            System.out.println("enter valid choice");
        }
    }
}