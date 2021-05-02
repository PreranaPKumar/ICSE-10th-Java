import java.util.Scanner;
public class array25
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String x[]=new String [13];
        int i=0;
        
        x[1]="January";        
        x[2]="February"; 
        
        x[3]="March";
        x[4]="April";
        
        x[5]="May";
        x[6]="June";
        
        x[7]="July";
        x[8]="August";
        
        x[9]="September";
        x[10]="October";
        
        x[11]="November";
        x[12]="December"; 
        System.out.println("enter the date");
        int date=sc.nextInt();
        System.out.println("enter the number of the month");
        i=sc.nextInt();
        System.out.println("enter the year");
        int year=sc.nextInt();
        if(i<=11)
        {
        i=i+1;
    }
    else
    {
        i=1;
        year=year+1;
    }
        System.out.println("the month(added 1) ad year is:  "+date+"  "+x[i] +"   "+year);
    }
}
        
        