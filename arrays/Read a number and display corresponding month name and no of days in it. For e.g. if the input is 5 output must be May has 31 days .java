import java.util.Scanner;
public class array23
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x[]=new String [13];
        int i=0;
        
        x[1]="January has 31 days";        
        x[2]="February has 28/29 days"; 
        
        x[3]="March has 31 days";
        x[4]="April has 30 days";
        
        x[5]="May has 31 days";
        x[6]="June has 30 days";
        
        x[7]="July has 31 days";
        x[8]="August has 31 days";
        
        x[9]="September has 30 days";
        x[10]="October has 31 days";
        
        x[11]="November has 30 days";
        x[12]="December has 31 days";    
     
        System.out.println("Enter the month number:");
        i=sc.nextInt();
        if(i<=12 &&i>0)
        {
         System.out.println(" result:\n"+x[i]);
        }
        else
        {
            System.out.println("enter valid choice");
        }
    }
}
        