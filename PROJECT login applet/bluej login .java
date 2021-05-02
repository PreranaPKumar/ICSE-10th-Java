import java.util.Scanner;
public class string_pro
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        boolean f=false,k=false,h=false;
        String existing[]={"MasterChef","McMicky","sahana","prerana","Suzan","BestKidInTown","CoolKid","SmartBoy","Christopherr"};
        while(f==false)
        {
            System.out.println("enter your name");
            String name=sc.nextLine();
            inner:while(k==false)
            {
                System.out.println("enter your username");
                String username=sc.nextLine();
                if(name.equals(username))
                {
                    System.out.println("username should not be same as the name");
                    continue inner;
                }
                for(int i=0;i<=8;i++)
                {
                    if(username.equals(existing[i]))
                    {
                       System.out.println("username is taken");
                       continue inner;
                    }
                }
                p:while(h==false)
                {
                    System.out.println("\nenter password");
                    String password=sc.nextLine();
                    if(password.equals(username))
                    {
                        System.out.println("Password should not be the same as username");
                        continue p;
                    }
                    for(int i=0;i<=(password.length()-1);i++)
                    {
                        char b=password.charAt(i);
                        if(!(((b>='A' && b<='Z') ||(b>='a' && b<='z')) || ( ((b=='_') || (b=='$')) || (b>=48) && (b<=57) )))
                        {
                            System.out.println("Password must not contain any special character other than ‘_’ and ‘$’ ");
                            continue p;
                        }
                    }
                    if((password.length())<=6)
                    {
                        System.out.println("Password is too short.Please enter more letters");
                        continue p;
                    }
                    int j=0;
                    int i=0;
                        //sahana s
                        ou:for(i=0;i<=(name.length()-1);i++)
                        {
                            char b=name.charAt(i);
                            for(j=0;j<=(password.length()-1);j++)
                            {
                                char d=password.charAt(j);
                                if(d==b)
                                {
                                   
                                    if(name.length()-1<(i+1) || password.length()-1<(j+1))
                                    {
                                        continue ou;
                                    }
                                    char c=password.charAt(j+1);
                                    if(c==(name.charAt(i+1)))
                                    {
                                        if(name.length()-1<(i+2) || password.length()-1<(j+2))
                                        {
                                        continue ou;
                                        }
                                        char lol=password.charAt(j+2);
                                        if(lol==(name.charAt(i+2)))
                                        {
                                            System.out.println("weak password. password must not contain 3 or more consecutive letters  from name of the user ");
                                            continue p;
                                        }
                                    }
                                }
                            }
                        }
                    int count=0;
                    for(i=0;i<=(password.length()-1);i++)
                    {
                        char b=password.charAt(i);
                        if (((b>='A' && b<='Z') || (b>='a' && b<='z')))
                        {
                            count++;
                        }
                    }
                     if(count==(password.length()))
                     {
                         System.out.println("It is weak. enter numbers");
                         continue p;
                     }
                     
                        //medium
                      int countt=0;  
                    if((password.length())>6 && (password.length())<=9 )
                    {
                         countt=1;
                    }
                        count=0;
                        int count1=0;
                        int count2=0;
                        for(i=0;i<=(password.length()-1);i++)
                        {
                            char lo=password.charAt(i);
                            if(lo>='A' && lo<='Z')
                            count++;
                            if(lo>='a' && lo<='z')
                            count1++;
                            if(lo=='$' || lo=='_')
                            count2++;
                        }
                   
                        if (((count>=1 && count1>=1) && (count2==0)) && (countt==1))
                        {
                            System.out.println("the password is medium");
                            System.out.println("enter 1 if you wish to change your password");
                            int kk=sc.nextInt();
                            if(kk==1)
                            continue p;
                            else
                            {
                                System.out.println("registration over \n");
                                System.out.println("welcome "+name+"!! \n your username is: "+username+"\n your password is: "+password);
                                System.exit(0);
                                f=true;
                                k=true;
                                h=true;
                            }
                        }
                        else if((count>=1 && count1>=1) &&(count2>0))
                        {
                            if((password.length())>10)
                            {
                                 System.out.println("the password is strong");
                                 System.out.println("enter 1 if you wish to change your password");
                                 int kk=sc.nextInt();
                                 if(kk==1)
                                 continue p;
                                 else
                                 {
                                     System.out.println("registration over \n");
                                     System.out.println("welcome "+name+"!! \n your username is: "+username+"\n your password is: "+password);
                                     System.exit(0);
                                    }
                                }
                                else
                                {
                                    System.out.println("the password is medium.\n To make it strong enter more characters");
                                    System.out.println("enter 1 if you wish to change your password");
                                 int kk=sc.nextInt();
                                 if(kk==1)
                                 continue p;
                                 else
                                 {
                                     System.out.println("registration over \n");
                                     System.out.println("welcome "+name+"!! \n your username is: "+username+"\n your password is: "+password);
                                     System.exit(0);
                                    }
                                }
                        }
                        else{
                            System.out.println("you need to either enter more characters or add capital and small letters or a special character to make it a strong password");
                           
                            continue p;
                        }
                     
                   
                   
                }          
            }
        }
    }
}
