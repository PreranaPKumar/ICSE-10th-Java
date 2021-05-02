import java.util.Scanner;
public class pairsArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[12];
        int i=0,count=0,sample=0,j=-1;
        for(i=0;i<=10;i++)
        {
            System.out.println("enter elements in pairs consecutively ");
            x[i]=sc.nextInt();
        }
        for(i=0;i<=10;i=i+2)         //0 2 4 6 8 10
        {
                j=j+2;               // 1 3 5 7 9 
                if(x[j]!=x[i])
                {
                   
                        sample=x[i];
                        System.out.println("the odd one out"+sample +" possition  "+i);
                        break;
               
                    
                }
               /*if(x[j]-x[i]!=0)
                    {
                        sample=x[i];
                        System.out.println("the pair "+sample +" position  "+i+"  "+j);
               
                    } */
        }
            
        }
    }
