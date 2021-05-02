import java.util.*;
public class projectjava
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        //questin array
        String q[]={"An object is a ....... of class","how would you describe java?","Bytecodes are always ..... for different platforms","A ..... is a blueprint of a collection of object that share common properties and relationships","what is the output of the following snippet:\n public static void main(String args[]){        System.out.print('A' + 'B');"};
        
        String one[]={"1)member","2)instance","3)alternate name"};
        String two[]={"1)programming language","2)a platform","3)Both (1) and (2)"};
        String three[]={"1)same","2)different","3)varying"};
        String four[]={"1)Function","2)Java","3)Class"};
        String five[]={"1)AB","2)Error","3)131"};
        
        String ans[]={"instance","Both (1) and (2)","same","Class","131"};
        int pos=0,count=0,er=0;
       while( pos<=4)
       {//while loop bracket
           
           System.out.println( q[pos]);//printg question
           if(pos==0)
           {
               for(int i=0;i<=2;i++)
               {
                 System.out.println(one[i]);
               }
            }
           if(pos==1)
           {
               for(int i=0;i<=2;i++)
               {
                 System.out.println(two[i]);
               }
            }
            if(pos==2)
           {
               for(int i=0;i<=2;i++)
               {
                 System.out.println(three[i]);
               }
            }
            if(pos==3)
           {
               for(int i=0;i<=2;i++)
               {
                 System.out.println(four[i]);
               }
            }
            if(pos==4)
           {
               for(int i=0;i<=2;i++)
               {
                 System.out.println(five[i]);
               }
            }
           System.out.println("enter answer");
           String answer=sc.nextLine();
           if(answer.equals(ans[pos]))
           {
            System.out.println("Correct answer!");
            count++;
            }
            else
            {
               System .out.println("Wrong answer");
               System.out.println("the correct answer is "+ans[pos]);
             }
            pos++;
           
           }//while loop bracket
            
            if(count==5)
            System.out.println("ALL CORRECT HURRAY!!");
            else
            er=5-count;
            System.out.println("\n\nREPORT:\nyou answered "+count+" questions correctly\nyou answered "+er+" questions incorrectly");
    }
}
        