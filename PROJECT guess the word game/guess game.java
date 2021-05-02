import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class proj
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,pos=1,b=0,length,i,count=0,score=100,error=0,num,count1=0,s,played=0,sigma=0,sigmaE=0,avg=0,min=0,se=0,check=0;
        boolean f=true;
        char letter,c,under='_',d,e,x;
        String clue="",y="";
        String full[]={"CHEMISTRY","BASKETBALL","CROCODILE","ABSORPTION","TELEVISION"};
        String posi[]={"012345678","0123456789","012345678","0123456789","0123456789"};
        String hang[]={"C_EM__T__","B_S__TB__L","C_OC__I__","AB_O___I_N","T_L__ISI__"};
        String first[]={"A science subject","an outdoor sport","a reptile","the state or process of being absorbed","shortened to telly"};
        String sec[]={"subject which contains info about atoms,molecules,elements..","michael jordan and lebron james play this","Scientific name: Crocodylinae","a condition in which something takes in another substance"," a telecommunication medium used for transmitting moving images"};
        String third[]={"physics,biology,?","NBA","CROCODI__","ABSORPT_I_N","TELE_ISI_N"};
         
           boolean option=true,idk=true;
            int countc=0,fu=0,az=0,z=0;
            String ans="";
        
            int start = (int) (new Date().getTime()/1000);
         System.out.println("\nWELCOME \n If you're a fan of word puzzles this is the game for you\n THE INSTRUCTIONS ARE: \n* You will be presented with a number of blank spaces representing the missing letters you need to find. \n* Use the keyboard to enter a position and also the designated letter\n* You will be given a hint at the begining and also 2 extra clues at choice, but each time you get a clue your score will be reduced\n* Although your start time will be displayed again and again it doesnt change.So not to worry!\n* ENTER ALL YOUR ANSWERS IN CAPITAL!");
         while(true)
        {   
         System.out.println("\n\nCHOOSE YOUR OPTION:\n 1. LETTER-BY-LETTER\n 2. WORD\n 3. QUIT GAME\n\n");
            a=sc.nextInt();
            System.out.println("you started on : " + new Date(((long)start)*1000L));//TIME STARTS ENDS WHEN YOU QUIT
            f=true;
            switch(a)
            {
                case 1:
                played++;
                
                while(f==true)//to give a new word if wrong pos
                {
                        b=(int)(Math.floor(Math.random()*5));
                        System.out.println(posi[b]);
                        System.out.println(hang[b]);
                        System.out.println("\nHere's a hint for you :"+first[b]);
                   System.out.println("\nGET CLUE? \n If this is your FIRST CLUE press'?'\n Else if it is your SECOND CLUE press '??'\n If you DONT want a clue PRESS any other character");
                        clue=sc.nextLine();
                        clue=sc.nextLine();
                        
                        if(clue.equals("?"))//str.equal()  name.equals(co[i]
                    {
                      System.out.println("This is your FIRST clue:" + sec[b]);
                      score=score-10;
                      check=1;
                    }
                    else if(clue.equals("??"))
                    {
                        if(check==1)
                        {
                        System.out.println("This is your SECOND clue:"+ third[b]);
                        score=score-10;
                        }
                        else
                        {
                            System.out.println("THIS IS YOUR FIRST CLUE: " + sec[b]);
                            score=score-10;
                            check=1;
                        }
                   }                                
                    else
                   {
                     System.out.println("You choose NOT to get a clue.PROCEEDING WITH THE GAME");
                   }
                      
                        System.out.println("\nEnter the position of the blank that u want to fill in first");
                        pos=sc.nextInt();
                        c=hang[b].charAt(pos);
                        if(c!=under)
                        {
                             System.out.println("WRONG POSITION. Enter a position which has a blank");
                             pos=sc.nextInt();
                             c=hang[b].charAt(pos);
                             if(c!=under)
                             {
                                 System.out.println("WRONG POSITION. Enter a position which has a blank");
                                 pos=sc.nextInt();
                                 c=hang[b].charAt(pos);
                             }
                        }
                        System.out.println("Enter the letter (IN CAPITAL LETTERS ONLY)");
                        letter=sc.next().charAt(0);
                        d=full[b].charAt(pos);
                        //System.out.println(hang[b].charAt(pos));
                        while(c==under && f==true)
                        {
                            if(count1==4)
                            {
                                System.out.println("These are the number of ERRORS: "+error);
                                System.out.println("This is your SCORE :"+score+"/100");
                                sigma=score+sigma;//TOTAL SCORE 90+0
                                   sigmaE=error+sigmaE;//TOTAL ERRORS
                                              avg=sigma/played;//AVERAGE SCORE
                                System.out.println("If you wish to play again press 1 \nIf you wish to quit press any other number");
                                s=sc.nextInt();
                                if(s==1)
                                {
                                    f=false;
                                    break;
                                }
                                else
                                {
                                    System.exit(0);
                                }
                                
                            }
                            if(d==letter)
                            {
                                hang[b] = hang[b].substring(0, pos)+letter+hang[b].substring(pos + 1);
                            }
                            if (d!=letter)
                            {
                                System.out.println("Awh you have entered the WRONG letter try again");
                                score=score-5;
                                error++;
                                count1=count1-1;
                               /* System.out.println("\nGET CLUE? \n If this is your FIRST CLUE press'?'\n Else if it is your SECOND CLUE press '??'\n If you DONT want a clue PRESS any other character");
                                clue=sc.nextLine();
                                clue=sc.nextLine();
                                if(clue.equals("?"))//str.equal()  name.equals(co[i]
                                {
                                    System.out.println("This is your FIRST clue:" + sec[b]);
                                    score=score-10;
                                }
                                else if(clue.equals("??"))
                                {
                                    System.out.println("This is your SECOND clue:"+ third[b]);
                                    score=score-20;
                                }                                
                                else
                                {
                                    System.out.println("You choose NOT to get a clue..PROCEEDING WITH THE GAME");
                                }*/
                                if(error>=3)
                                {
                                    System.out.println("\nTOO MANY ERRORS.\nTHE NUMBER OF ERRORS ARE: "+error+"(╥_╥) \nTHE CORRECT ANSWER IS:   "+full[b]+"\nWE WILL PROVIDE YOU WITH A DIFFERENT WORD IF YOU WISH TO CONTINUE");
                                    f=false;
                                    continue;
                                }
                            }
                            System.out.println(posi[b]);
                            System.out.println(hang[b]);
                              System.out.println("\nGET CLUE? \n If this is your FIRST CLUE press'?'\n Else if it is your SECOND CLUE press '??'\n If you DONT want a clue PRESS any other character");
                              clue=sc.nextLine();
                              clue=sc.nextLine();
                        
                              if(clue.equals("?"))//str.equal()  name.equals(co[i]
                              {
                                  System.out.println("This is your FIRST clue:" + sec[b]);
                                  score=score-10;
                                  check=1;
                                }
                                else if(clue.equals("??"))
                                {
                                    if(check==1)
                                    {
                                        System.out.println("This is your SECOND clue:"+ third[b]);
                                        score=score-10;
                                    }
                                    else
                                    {
                                        System.out.println("THIS IS YOUR FIRST CLUE: " + sec[b]);
                                        score=score-10;
                                        check=1;
                                    }
                                }                                
                                else
                                {
                                    System.out.println("You choose NOT to get a clue.PROCEEDING WITH THE GAME");
                                }
                            System.out.println("Enter the position of the blank that u want to fill in first");
                            pos=sc.nextInt();
                            System.out.println("Enter the letter in ALL CAPS");
                            letter=sc.next().charAt(0);
                            c=hang[b].charAt(pos);
                            if(c!=under)
                            {
                                System.out.println("WRONG POSITION. Enter a position which has a blank");
                                pos=sc.nextInt();
                                c=hang[b].charAt(pos);
                                if(c!=under)
                                {
                                    System.out.println("WRONG POSITION. Enter a position which has a blank");
                                    pos=sc.nextInt();
                                    c=hang[b].charAt(pos);
                                }
                            }
                            d=full[b].charAt(pos);
                            count1++;
                        }
                        
                        
                        
                    }
                    
                break;
                
                case 2://string body
                
                
                check=0;
                played++;
                option=true;
                while(option==true)
                {
                   score=110;
                   error=-1;
                  System.out.println("\n\nyou chose word");
                   b=(int)Math.floor(Math.random()*5);
                   System.out.println(hang[b]);
                   System.out.println("here is a hint for you:   "+first[b]);
                   while(!(ans.equals(full[b])))
                   {
                      error++;
                      score=score-10;
                   System.out.println("\nGET CLUE? \n If this is your FIRST CLUE press'?'\n Else if it is your SECOND CLUE press '??'\n If you DONT want a clue PRESS any other character");
                    clue=sc.nextLine();
                    clue=sc.nextLine();
                    if(clue.equals("?"))//str.equal()  name.equals(co[i]
                    {
                      System.out.println("This is your FIRST clue:" + sec[b]);
                      score=score-10;
                      check=1;
                    }
                    else if(clue.equals("??"))
                    {
                        if(check==1)
                        {
                        System.out.println("This is your SECOND clue:"+ third[b]);
                        score=score-10;
                        }
                        else
                        {
                            System.out.println("THIS IS YOUR FIRST CLUE: " + sec[b]);
                            score=score-10;
                            check=1;
                        }
                   }                                
                    else
                   {
                     System.out.println("You choose NOT to get a clue.PROCEEDING WITH THE GAME");
                   }
                    System.out.println(hang[b]);
                    System.out.println("ENTER YOUR ANSWER IN ALL CAPS");
                      ans=sc.nextLine();
                      System.out.println("confirm your answer");
                      ans=sc.nextLine();
                }
                    if(ans.equals(full[b]))
                    {
                        
                        System.out.println("GOOD JOB YOU GOT IT CORRECT!!\nYOUR SCORE IS:  "+score+"/100");
                        sigma=score+sigma;//TOTAL SCORE.
                        sigmaE=sigmaE+error;//TOTAL ERROR
                        
                        avg=sigma/played;//AVERAGE DOESNT WORK IN BOTH ALWAYS 0
                              
                        option=false;
                        continue;
                    }
                    /*else
                    {
                        
                        //System.out.println("INCORRECT ANSWER.BETTER LUCK NEXT TIME\nTHE CORRECT ANSWER IS   "+full[b]+"   YOUR SCORE IS:   "+score+"/100");
                       // while(idk==true)
                        //{
                            while(z<=(full[b].length())-1 && az<=(ans.length())-1)
                            {
                                fu=full[b].charAt(z);
                                if(fu==ans.charAt(az))
                                {
                                countc++;
                                System.out.println("countc"+countc);
                                }
                                else
                                {
                                  
                                  System.out.println("error"+error);
                                }
                                z++;
                                az++;
                            }
                        //} 
                       } */
                      if(error>=3)
                       {
                             System.out.println("\nTOO MANY ERRORS.\nTHE NUMBER OF ERRORS ARE: "+error+"(╥_╥) \nTHE CORRECT ANSWER IS:   "+full[b]+"\nWE WILL PROVIDE YOU WITH A DIFFERENT WORD IF YOU WISH TO CONTINUE");
                             option=false;
                             continue;
                         }           
        }
          break;
          
          
                       case 3:
                                         int end = (int) (new Date().getTime()/1000);
                                         System.out.println("you finished on : " + new Date(((long)end)*1000L));
                                         int ttime=end-start;
                                         if(ttime>=60)
                                         {
                                             min=ttime/60;
                                             se=ttime%60;
                                             System.out.println("\n\nYOUR STATS ARE:\nTOTAL TIME TAKEN:   "+min+" minutes "+se+" seconds");
                                          }
                                          else
                                          {
                                              System.out.println("\n\nYOUR STATS ARE:\n*TOTAL TIME TAKEN:   "+ttime+" seconds");
                                            }
                                         System.out.println("*TOTAL SCORE:   "+sigma+"\n*AVERAGE SCORE   "+avg+"\n*TOTAL ERRORS:   "+sigmaE);
                                         
                                        
                                         System.exit(0);
                                         
                                            break;
                
                
                                    default:
                                           System.out.println("INVALID.CHOOSE THE CORRECT OPTION");
                                            
                                          break;
                    
    }
 } 
} 
}                
                                
