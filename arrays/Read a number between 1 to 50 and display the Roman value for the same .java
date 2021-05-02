import java.util.Scanner;
public class array26
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ones[]=new String[10];   
        String tens[]=new String[6];
        ones[0]= "";
        ones[1]= "I";
        ones[2]= "II";
        ones[3]= "III";
        ones[4]= "IV";
        ones[5]= "V";
        ones[6]= "VI";
        ones[7]= "VII";
        ones[8]= "VIII";
        ones[9]= "IX";
        
        tens[0]="";
        tens[1]="X";
        tens[2]="XX";
        tens[3]="XXX";
        tens[4]="XL";
        tens[5]="L";
        
        int i=0,num=0,res=0,a=0,num2=0,num3=0;
        System.out.println("enter a number between 1 to 50");
        num=sc.nextInt();
        a=num;
        if(num==0)
        {
            System.out.println("INVALID");
            System.exit(0);
        }
        
        if(num>10)
        {
          num2=(num%100)/10;
          //System.out.println("tens"+tens[num2]);
          num3=(num%10);
          //System.out.println("ones"+ones[num3]);   
          System.out.println("the number in roman numeral is:   "+ tens[num2]+ones[num3]);
         }
        else 
        {
          num3=(num%10);
          //System.out.println("ones"+ones[num3]);            
          System.out.println("the number in roman numeral is:   "+ones[num3]);
         }          
        
    }
}
