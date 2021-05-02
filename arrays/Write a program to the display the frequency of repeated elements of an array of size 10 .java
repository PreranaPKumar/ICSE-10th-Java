import java.util.Scanner;
 public class frequencyarrray
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[10];
        int i=0,count=0,a=0,j=0;
        System.out.println("enter 10 elemnts");
        for(i=0;i<=9;i++)
        {
            x[i]=sc.nextInt();
        }
        outer:for(i=0;i<=9;i++)
        {
         a=x[i];
         count=0;
         for(j=0;j<i;j++)
         {
            
             if(x[j]==a)
             {                 
                 continue outer;
             } 
            }
         for(j=i;j<=9;j++)//right
         {
             if(x[j]==a)
            {
                 count++;
            } 
         }     
         
                
                  
           if(count>1)
           {
               System.out.println("the frequency of "+(x[i])+" is "+count);
               
            }
            
        }
        }
       
      }
   
                
         
        
        
        
        
        