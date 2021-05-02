import java.util.*;
public class Project
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
        System.out.println("\n select the topic: \n Addition:\n 1   one digit addition  \n 2   two digit addition \n Subtraction: \n 3   one digit subtraction \n 4   two digit subtraction \n Multiplication \n 5   one digit multiplication \n 6   two digit multiplication \n Division \n 7   one digit division \n 8   two digit division \n 9  exit \n\n\n");
        int x=sc.nextInt();
        double a,b,c,d;
        int j,count=0;
        switch(x)
        {
            case 1:
                  System.out.println("You chose one digit addition");
                  System.out.println("\nhow many questions? \n\nthe question is below"  );
                  int i=sc.nextInt();
                  for(j=1;j<=i;j++)
                 {
                 a=Math.floor(Math.random() * 10);   
                 b=Math.floor(Math.random() * 11);
                 c=a+b;
                  System.out.println(a+" +"+b+" =");
                  System.out.println("enter the answer");
                 d=sc.nextDouble();
                 if(c==d)
                 {
                  System.out.println("good job!!");
                   count++;
                
                  }
                  else
                 {
                   System.out.println("better luck next time");
                 }
                 }
                   System.out.println("your score is "+count);
                   break;
            
            
            
            case 2:
                  System.out.println("you chose two digit addition");
                  System.out.println("\nhow many questions? \n\nthe question is below"   );
                 i=sc.nextInt();
                 for (j=1;j<=i;j++)
                 {
                  a=Math.floor(Math.random() * 101);   
                  b=Math.floor(Math.random() * 100);
                  c=a+b;
                  System.out.println(a+"+"+b+"=");
                  System.out.println("enter the answer");
                  d=sc.nextDouble();
                  if(c==d)
                    {
                     System.out.println("good job!!");
                     count++;
                    }
                 else
                    {
                     System.out.println("better luck next time");
                    }
                   }
                   System.out.println("total score out of "+i+"="+count);
                   break;
             

            case 3:
                    System.out.println("you chose one digit subtraction");
                    System.out.println("\nhow many questions? \n\nthe question is below");
                    i=sc.nextInt();
                    for(j=1;j<=i;j++)
                    {
                     a=Math.floor(Math.random() * 11);   
                     b=Math.floor(Math.random() * 11);
                     if(a>b)
                     {
                         System.out.println(a+" -"+b+"=");
                         c=a-b;
                         System.out.println("enter your answer");
                         d=sc.nextInt();
                         if(c==d)
                         {
                            System.out.println("good job!!");
                            count=count+1;
                         }
                         else
                         {
                            System.out.println("better luck next time");
                         }
                     }
                     else if(b>a)
                     {
                        System.out.println(b+" -"+a+"=");
                        c=b-a;
                        System.out.println("enter your answer");
                        d=sc.nextInt();
                        if(c==d)
                        {
                            System.out.println("good job!!");
                            count=count+1;
                        }
                        else
                        {
                            System.out.println("better luck next time");
                        }
                        
                    }
                    System.out.println("you score is"+count);
                }
                
            case 4:
                     System.out.println("you chose two digit subtraction");
                     System.out.println("\nHow many questions? \n\nthe question is below");
                     i=sc.nextInt();
                    for (j=1;j<=i;j++)
                    {
                     a=Math.floor(Math.random() * 100);   
                     b=Math.floor(Math.random() * 100);
                     if (a>b)
                     {
                      System.out.println(a+"-"+b+"=");
                      c=a-b;
                      System.out.println("enter the answer");
                      d=sc.nextDouble();
                      if(c==d)
                      {
                        System.out.println("good job!!");
                        count++;
                      }
                      else
                     {
                      System.out.println("better luck next time");
                     }
                    }
                    else
                    {
                      System.out.println(b+"-"+a+"=");
                      c=b-a;
                      System.out.println("enter the answer");
                      d=sc.nextDouble();
                      if(c==d)
                      {
                        System.out.println("good job!!");
                        count++;
                      }
                     else
                     {
                       System.out.println("better luck next time");
                     }
                    }
                   }
                  System.out.println("total score out of "+i+"="+count);
                  break;
                  
            case 5:
                      System.out.println("you chose one digit multiplication");
                      System.out.println("\nhow many questions? \n\nthe question is below");
                       i=sc.nextInt();
                      for(j=1;j<=i;j++)
                      {
                       a=Math.floor(Math.random() * 10);   
                       b=Math.floor(Math.random() * 11);
                       c=a*b;
                      System.out.println(a+" x "+b+" =");
                      System.out.println("enter the answer");
                      d=sc.nextDouble();
                      if(c==d)
                      {
                        System.out.println("good job!!");
                        count++;
                
                       }
                     else
                     {
                     System.out.println("better luck next time");
                      }
                     }
                     System.out.println("your score is "+count);
                     break;
                     
            case 6:
                        System.out.println("you chose two digit multiplication");
                        System.out.println("how many questions? \n\nthe question is below");
                         i=sc.nextInt();
                          for(j=1;j<=i;j++)
                         {
                          a=Math.floor(Math.random() * 100);   
                           b=Math.floor(Math.random() * 101);
                           c=a*b;
                           System.out.println(a+" x "+b+" =");
                           System.out.println("enter the answer");
                           d=sc.nextDouble();
                          if(c==d)
                         {
                          System.out.println("good job!!");
                          count++;
                         }
                         else
                         {
                          System.out.println("better luck next time");
                         }
                         }
                        System.out.println("your score is "+count);
                        break;
                        
           case 7:
                       System.out.println("you choose one digit division");
                       System.out.println("how many questions? \n\nthe question is below");
                       i=sc.nextInt();
                       for(j=1;j<=i;j++)
                       {
                         a=Math.floor(Math.random() * 11);   
                         b=Math.floor(Math.random() * 11);
                         if(a>b && a%b==0)
                       {
                         System.out.println(a+" ÷ "+b+"=");
                         c=a/b;
                         System.out.println("enter the answer");
                         d=sc.nextDouble();
                         if(c==d)
                         {
                            System.out.println("good job!!");
                            count++;
                         }
                         else
                         {
                            System.out.println("better luck next time");
                         }
                        }
                        else if (b>a && b%a==0)
                        {
                         System.out.println(b+" ÷  "+a+"=");
                         c=b/a;
                         System.out.println("enter the answer");
                         d=sc.nextDouble();
                         if(c==d)
                         {
                            System.out.println("good job!!");
                            count++;
                         }
                         else
                         {
                            System.out.println("better luck next time");
                         }
                        }
                      }
                     System.out.println("total score out of "+"="+count);
                     break;
            case 8:
                     System.out.println("how many questions? \n\nthe question is below");
                     i=sc.nextInt();
                     for(j=1;j<=i;j++)
                     {
                      int idk =0;
                      while (idk!=1)
                      {
                        idk=0;
                       a=Math.floor(Math.random() * 11);   
                       b=Math.floor((Math.random()*90)+10);
                       if (b>a && b%a==0)
                        {
                        System.out.println(b+" ÷  "+a+"=");
                        c=b/a;
                        System.out.println("enter the answer");
                        d=sc.nextDouble();
                        if(c==d)
                        {
                            System.out.println("good job!!");
                            count++;
                        }
                        else
                        {
                            System.out.println("better luck next time");
                        }
                        idk=1;
                      }
                       else
                      {
                         idk=0;
                      }
                      }
                
                      }
                     System.out.println("total score out of "+"="+count);
                     break;
            case 9:
                    System.out.println("you quit the application");
                    System.exit(0);
                        
                        

                    
                }
        }
            
            
        }
    }
