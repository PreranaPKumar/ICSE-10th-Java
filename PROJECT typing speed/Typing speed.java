import java.util.*;

public class type

{

    public static void main(String[] args)

    {

        while(true)

        {

         Scanner sc = new Scanner(System.in); 

         int count=0,error=0,e=0,d=0,i=0,j=0,z=0;

         int count1=0,count3=0,count2=0;

         double startTime=0, endTime=0,sum3=0,sum2=0,sum=0,sum1=0;

         System.out.println("\nchoose the option:\n 1.start\n 2.exit");

         int opt=sc.nextInt();

         switch(opt)

         {

             case 1:
                while (z!=1)
                {
                System.out.println("\nWelcome to the typing speed test!");
                System.out.println("\nHere are some basic instructions to be followed : \n\n   i. You will be given a sentence.Read the sentence carefully, then type it as fast and accurately as possible. \n  ii. You can use autocorrection,swipe and any other typing features. \n iii. Press 1 to start and press 2 after you have finished typing the sentence.");
                System.out.println("\n enter 1 if u understood the instructions");
                z=sc.nextInt();
                if(z==1)
                {

            
         //String[] strings={"The Golden Retriever is a medium-large gun dog that was bred to retrieve shot waterfowl","The Avengers, is a 2012 American superhero film based on the Marvel Comics superhero team of the same name.","The Indian Institutes of Technology (IITs) are autonomous public technical and research universities located across India","if a dog chews shoes,whose shoes will he choose?","A skunk sat on a stump and thought that the stump stunk, but the stump thought that the skunk stunk. ","Susie works in a shoeshine shop. Where she shines she sits, and where she sits she shines","Ryan International Schools are a group of private educational institutions in India founded in 1976 by Dr. Augustine Francis Pinto.","Because my coffee was too cold, I heated it in the microwave.","at any given moment in the middle of a city there is a million epiphanies occuring in the blurring of the world beyond the curtain.","She returned the computer after she noticed it was damaged"};
         String[] strings={"I drank coffee yesterday","Today is a sunny day","He guessed the answer","He told that the exam was hard","She went shopping at 7","Susie works in a shoeshine shop. ","Today is her birthday","Because my coffee was too cold, I heated it in the microwave."," He was bored ","She returned the computer after she noticed it was damaged"};

         int index=(int)(Math.random()*10); 

         String a=strings[index];

         System.out.println("\n"+a);

         System.out.println("\nstart typing after pressing 1\n");

         int b=sc.nextInt();

         if(b==1)

         {

           

          // THE START TIME

 

          startTime = System.currentTimeMillis();

        

         }
         else
           {
             System.out.println("Invalid.\nExiting the application.");
             System.exit(0);
            }

         System.out.println("Press 2 after you finish typing");
          System.out.println("Start typing!!");

          String str=sc.nextLine();
          str=sc.nextLine();

          
          

          int f=str.length();

          System.out.println("PRESS 2");

          int db=sc.nextInt();

         if(db==2)

          {

           endTime = System.currentTimeMillis();

          

          }
          else
           {
             System.out.println("invalid.Exiting the application.");
             System.exit(0);
            }

           //int ori=a.length();

          //if(f!=ori)

          //{

           // System.out.println("INCOMPLETE\nENTER THE CHARACTERS CORRECTLY\nExiting the application.");

           // System.exit(0);

          //}      
        StringTokenizer st1 = new StringTokenizer(a); 
        StringTokenizer st2 = new StringTokenizer(str);
        StringTokenizer st3 = new StringTokenizer(str);
        
        
        String extractedWord="";
        String abc="";
        String oof="";
        while (st3.hasMoreTokens()) 
        {
            count3++;
            oof= st3.nextToken(); // do not remove this
        }
        
        while (st1.hasMoreTokens()) 
        {
            extractedWord = st1.nextToken();
            abc=st2.nextToken();
            if(extractedWord.equals(abc))
            {
                count2++;
            }
            else
            {
                error++;
            }
        }
    System.out.println("the number of words you entered :"+count3);
    System.out.println("the number of correct words:"+count2);
    int aaa=count3-count2;
    System.out.println("the number of incorrect words :"+aaa);
  if (error>6)

{

   System.out.println("TOO MANY ERORRS\nBETTER LUCK NEXT TIME!\n Exiting the application");

   System.exit(0);

  

}

else if (error>=1)

{

   System.out.println("OOPS!YOU GOT A FEW ERRORS.");

   sum3=(endTime-startTime)/60000;

   sum2=count2/sum3;
   
   System.out.println("\nWORDS PER MINUTE:" +sum2);


}

else

{

   System.out.println("NO ERRORS!SPLENDID!!");

   sum3=(endTime-startTime)/60000;

   sum2=count2/sum3;

   System.out.println("\nWORDS PER MINUTE:" +sum2);

}

 

   break;
     }
                else
                {
                    System.out.println("\n We will be repeating the instructions till you have understood it");
                    z=2;
                }
                }
                break;
            
 
 
case 2:

System.out.println("YOU QUIT THE APPLICATION");

System.exit(0);

break;



default:

System.out.println("\nCHOOSE A VALID OPTION");

break;

               

}

}

} 

}
