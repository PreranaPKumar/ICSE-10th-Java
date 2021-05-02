import java.util.Scanner;
public class function6
{
    void pattern(char c)
    {
         int i=0,j=0;
         char ch='A';
         while(ch<=c)
         {
            for( i=1;i<=5;i++)// rows
            {
                for(j=1;j<=i;j++)//column
                {
                    if(ch>c)
                    break;
                    System.out.print(ch+" ");
                    ch++;
                    
                    
                }
                System.out.println();
            }
        }

    }
    void pattern(int n)
    {
        int i,j,x=1,line=0;
        while(line<=n)
        {
            for(i=1;i<=5;i++)// rows
            {
                line++;
                if(line>n)
                break;
                for(j=1;j<=i;j++)//column
                {
                    System.out.print(x+" ");
                    x++;
                    
                }
                System.out.println();
            }
        }
    }

    void pattern( )
    {
            char ch='A';
            int i,j;
            while(ch<='O')
            {
                for( i=1;i<=5;i++)// rows
                {
                    for(j=1;j<=i;j++)//column
                    {
                        System.out.print(ch+" *");
                        ch++;
                        
                    }
                    System.out.println();
                }
            }
        
    }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            function6 obj=new function6();
            char ca;
            int l=0;
            System.out.println("CHOOSE THE OPTION:\n1.A\n  B C\n  D E F\n  G H I .... to the letter input\n2.1\n  2 3\n  4 5 6.. to the no. of lines input");
            System.out.println("3.A * \n   B *C *\n    D *E *F *\n     G *H *I *J *\n    K *L *M *N *O *");
            int op=sc.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("enter the letter");
                    ca=sc.next().charAt(0);
                    obj.pattern(ca);
                    break;
                case 2:
                    System.out.println("enter the no. of lines");
                    l=sc.nextInt();
                    obj.pattern(l);
                    break;
                case 3:
                    System.out.println("the pattern is:");
                    obj.pattern();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    System.exit(0);
                    break;
                }
        }
    }
                
                
                
                