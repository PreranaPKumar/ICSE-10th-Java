import java.util.Scanner;
public class yearly_calendar
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         String month[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
         String day[]={"","Mon","Tues","Wed","Thurs","Fri","Sat","Sun"};
         int monthday[]={0,31,28,31,30,31,30,31,31,30,31,30,31}; // the number of days in each month
         int year[]={0,2022,2021,2020,2019,2018,2017,2016,2015,2014,2013,2012,2011,2010};// the years for which i have prepared the monthly calender for
         String startday[]={"","Sat","Fri","Wed","Tues","Mon","Sun","Fri","Thurs","Wed","Tues","Sun","Sat","Fri"};// the strting days of the years
         int y,i,j,k,l,x=1,p=1,Day=0,count=0,count1=0;
         String m,d;
         System.out.println("Enter a year between 2010 and 2022");
         y=sc.nextInt();
         for(i=1;i<=8;i++)//to check if the year entered is present in the list
         {
             if(y!=year[i])
             {
                 count1++;
                }
            }
         if(count1==0)
         {
              System.out.println("INVALID ENTRY.EXITING THE PROGRAM.");
              System.exit(0);
         }
         if(y%4==0)
          {
              monthday[2]=29;// rewriting the no. of days in feb if it is a leap year
          }
          System.out.println("Enter the month");
          m=sc.nextLine();
          m=sc.nextLine();
          int u=0;
          int monthnumber=0;
          for(i=1;i<=12;i++)
          {
              if(m.equals(month[i]))
              {
                  monthnumber=i; // to find the month number 
                }
            }
            for(i=1;i<=7;i++)
            {
                if(startday[Day].equals(day[i]))
                {
                    Day=i; // to find which day the year starts with
                    break;
                }
            }
            for(i=1;i<=monthnumber;i++)
            {
                if(monthnumber==1)
                {
                    break; // day =jan ; as calculation is not required for january being the first month
                }
                if(count==0)
                {
                    u=((monthday[i]+Day)%7);// adds the days to the starting day of each year to get the calender of the desired month
                    Day=0;
                    Day=u;
                }
                else
                {
                    u=((monthday[i]+u))%7;// adds the days to the starting day of each year to get the calender of the desired month
                    Day=u;
                }
                count++;
            }
            if(Day==0)//the day will be sunday if it is zero as 7%7=0
            { 
                Day=7;
            }
            for(i=1;i<=12;i++)//printing design
            {
                if(m.equals(month[i]))
                {
                    
                    System.out.println("              "+m+" "+y+"              ");
                    
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    for(j=1;j<=7;j++)//printing of the days
                    {
                        System.out.print("  "+day[j]);
                        
                    }
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    
                    if(monthday[monthnumber]==30)
                    {
                        for(k=1;k<=6;k++)//5 rows
                        {
                            for(l=1;l<=7;l++)
                            {
                            
                                if(x<=monthday[i])
                                {
                                    if(p<=Day)
                                    {
                                        System.out.print("      ");
                                    } 
                                    else
                                    {
                                        if(x>=10)
                                        {
                                            System.out.print(" "+x+"   ");
                                        }
                                        else
                                        {
                                            System.out.print("  "+x+"   ");
                                        }
                                        x++;
                                    }
                                    p++;
                                }
                            else
                            {
                                break;
                            }
                        }
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    }
                
                       
                        
                        
                 }
                    else if(monthday[monthnumber]==31)
                    {
                        for(k=1;k<=6;k++)//5 rows
                        {
                            for(l=1;l<=7;l++)
                            {
                            
                                if(x<=monthday[i])
                                {
                                    if(p<Day)
                                    {
                                        System.out.print("      ");
                                    } 
                                    else
                                    {
                                        if(x>=10)
                                        {
                                            System.out.print(" "+x+"   ");
                                        }
                                        else
                                        {
                                            System.out.print("  "+x+"   ");
                                        }
                                        x++;
                                    }
                                    p++;
                                }
                            else
                            {
                                break;
                            }
                    
                          }
                          System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        }
                            
                }
            }
        }
    }
}


                    
                                    
                                
                    
            
          
              
         
         
         
    
    

    
            
       
        
                    

               
    

