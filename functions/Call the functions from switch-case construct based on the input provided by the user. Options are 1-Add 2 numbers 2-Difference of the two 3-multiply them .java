import java.util.Scanner;
public class function4
{
        int add(int a,int b)
        {
            int sum=a+b;
            return sum;
        }
        int sub(int a,int b)
        {
            int dif=a-b;
            return dif;
        }
        int mul(int a,int b)
        {
            int pro=a*b;
            return pro;
        }
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            function4 obj=new function4();
            int x,y,res;
            System.out.println("CHOOSE OPTION\n1.Addition\n2.Subtraction\n3.Multiplication");
            int op=sc.nextInt();
            switch(op)
              {
                case 1:
                    System.out.println("you chose addition");
                    System.out.println("enter two numbers");
                     x=sc.nextInt();
                     y=sc.nextInt();
                     res=obj.add(x,y);
                    System.out.println("the sum is "+res);
                    break;
                    
                    case 2:
                    System.out.println("you chose subtraction");
                    System.out.println("enter two numbers");
                     x=sc.nextInt();
                     y=sc.nextInt();
                     res=obj.sub(x,y);
                    System.out.println("the difference is "+res);
                    break;
                    
                    case 3:
                    System.out.println("you chose multiplication");
                    System.out.println("enter two numbers");
                     x=sc.nextInt();
                     y=sc.nextInt();
                     res=obj.mul(x,y);
                    System.out.println("the product is is "+res);
                    break;
                    
                    default:
                        System.out.println("invalid");
                        System.exit(0);
                        break;
                    }
            }
        }
                
                
            
        
        