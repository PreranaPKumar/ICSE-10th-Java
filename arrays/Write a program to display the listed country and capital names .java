import java.util.Scanner;
public class array29
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String co[]=new String[20];
        String ca[]=new String[20];
        int i=0,j=10;
        
        co[0]="AFGHANISTAN";
        ca[0]="KABUL";
        
        co[1]="BELGIUM";
        ca[1]="BRUSSELS";
        
        co[2]="CHILE";
        ca[2]="SANTIAGO";
        
        co[3]="DENMARK";
        ca[3]="COPENHAGEN";
        
        co[4]="EGYPT";
        ca[4]="CAIRO";
        
        co[5]="FRANCE";
        ca[5]="PARIS";
        
        co[6]="GERMANY";
        ca[6]="BERLIN";
        
        co[7]="HUNGARY";
        ca[7]="BUDAPEST";
        
        co[8]="INDIA";
        ca[8]="NEW DELHI";
        
        co[9]="JAPAN";
        ca[9]="TOKYO";
        
        co[10]="KENYA";
        ca[10]="NAIROBI";
        
        co[11]="LATVIA";
        ca[11]="RIGA";
        
        co[12]="MAURITIUS";
        ca[12]="PORT LOUIS";
        
        co[13]="NEW ZEALAND";
        ca[13]="WELLINGTON";
        
        co[14]="OMAN";
        ca[14]="MUSCAT";
        
        co[15]="POLAND";
        ca[15]="WARSAW";
        
        co[16]="QATAR";
        ca[16]="DOHA";
        
        co[17]="RUSSIA";
        ca[17]="MOSCOW";
        
        co[18]="SWITZERLAND";
        ca[18]="BERN";
        
        co[19]="TURKEY";
        ca[19]="ANKARA";
      
        System.out.println("ENTER A COUNTRY");
        String name=sc.nextLine();
        
       
        int count=0;
        
        
     for(i=0;i<=19;i++)
        {
            if (name.equals(co[i]))
            {
                 System.out.println("THE CAPITAL OF  "+co[i]+"  IS  "+ca[i]);
                count++;
                break;
            }
        }
        if(count==0)
        {  System.out.println("THE COUNTRY GIVEN IS NOT IN THE LIST");        
     
        }
        
    }
            
}

            
                
        
        
        