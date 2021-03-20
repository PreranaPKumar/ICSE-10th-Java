import java.util.Scanner;
public class series
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      //(10*1)/3 +(20*3)/5..n terms
      System.out.println("enter the number of terms");
      int n=sc.nextInt();
      double sum=0;
      int i,x=10,y=1,z=3;
      for(i=1;i<=n;i++)
      {
         sum=sum+((x*y)/z);
         x=x+10;
         y=y+2;
         z=z+2;
      }
      System.out.println("the sum of the terms  "+sum);
  }
}
