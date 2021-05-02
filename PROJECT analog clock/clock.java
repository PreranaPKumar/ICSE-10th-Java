import java.awt.*; 
import java.awt.Frame; 
import java.awt.Graphics; 
import java.awt.Point; 
import java.util.Random; 
import javax.swing.JFrame; 
import java.util.Formatter; 
import java.util.concurrent.TimeUnit;


public class ShapeTest2 extends JFrame
{ 
    int width=1000; int height=1000;
   int x=450,y=200,a=450,b=200,c=450,d=200;
    public ShapeTest2()
    { 
        setSize(width,height); //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //setResizable(false); 
        setLocationRelativeTo(null);
        setVisible(true); 
    } 
    public static void main(String a[])
    { 
        new ShapeTest2(); 
    } 
    public void paint(Graphics g)
    { 
        //Circular Surface 
        try{
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
        double width1 = screenSize.getWidth();
        System.out.println("w "+width1);
        double height1 = screenSize.getHeight();
        System.out.println("h "+height1);
        int w= (int)width; 
        StringBuilder sb = new StringBuilder(); 
        Formatter formatter = new Formatter(sb);
       g.drawOval(250, 200, 400,400); 
        g.drawLine(450, 400,450,200);
        g.setColor(Color.BLUE);
        g.drawLine(450, 400,a,b); 
        g.setColor(Color.RED);
        g.drawLine(450, 400,c,d);
        int h=0;
        for(int j=1;j<=60;j++)
        {
            h++;
                if(c==a && d==b)
                {
                    g.setColor(Color.GREEN);
                    g.drawLine(450, 400,a,b);
                }
                else
                {
                     g.setColor(Color.WHITE);
                     g.drawLine(450, 400,a,b);
                }
            if(j<=15)
            {
            a=a+13;
            b=b+13;
            if(j==15)
            {
                b=b+5;
            }
            g.setColor(Color.BLUE);
            g.drawLine(450, 400,a,b);
            }
        else if(j>15 && j<=30)
        {
            a=a-13;
            b=b+13;
            if(j==30)
            {
                b=b+5;
            }
            g.setColor(Color.BLUE);
        g.drawLine(450, 400,a,b);
        }
        else if(j>30 && j<=45)
        {
            a=a-13;
            b=b-13;
            if(j==45)
            {
                b=b-5;
            }
            g.setColor(Color.BLUE);
            g.drawLine(450, 400,a,b);
        }
        else
        {
            a=a+13;
            b=b-13;
            if(j==60)
            {
                b=b-5;
            }
            g.setColor(Color.BLUE);
            g.drawLine(450, 400,a,b);
        }
        for(int i=1;i<=15;i++)
        { 
            x=x+13;
            y=y+13;
            if(i==15)
            {
                y=y+5;
            }
            if ((x==a && y==b) && (c==x && d==y))
            {
                g.setColor(Color.RED);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
            }
            else if(c==x && d==y)
            {
               g.setColor(Color.RED);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
            }
            else if(x==a && y==b)
            {
               g.setColor(Color.BLUE);
               g.drawLine(450, 400,x,y);
               TimeUnit.SECONDS.sleep(1);
            }
            else
            {
                g.setColor(Color.BLACK);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
                g.setColor(Color.WHITE);
                g.drawLine(450, 400,x,y);
            }
        }
        for(int i=1;i<=15;i++)
        { 
            x=x-13;
            y=y+13;
            if(i==15)
            {
                y=y+5;
                System.out.println("y h "+y);
            }
            if ((x==a && y==b) && (c==x && d==y))
            {
                g.setColor(Color.RED);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
            }
            else if(c==x && d==y)
            {
               g.setColor(Color.RED);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
            }
            else if(x==a && y==b)
            {
               g.setColor(Color.BLUE);
               g.drawLine(450, 400,x,y);
               TimeUnit.SECONDS.sleep(1);
            }
            else
            {
                g.setColor(Color.BLACK);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
                g.setColor(Color.WHITE);
                g.drawLine(450, 400,x,y);
            }
        }
        for(int i=1;i<=15;i++)
        { 
            x=x-13;
            y=y-13;
            if(i==15)
            {
                y=y-5;
                System.out.println("y h "+y);
            }
            if ((x==a && y==b) && (c==x && d==y))
            {
                g.setColor(Color.RED);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
            }
            else if(c==x && d==y)
            {
               g.setColor(Color.RED);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
            }
            else if(x==a && y==b)
            {
               g.setColor(Color.BLUE);
               g.drawLine(450, 400,x,y);
               TimeUnit.SECONDS.sleep(1);
            }
            else
            {
                g.setColor(Color.BLACK);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
                g.setColor(Color.WHITE);
                g.drawLine(450, 400,x,y);
            }
        }
        for(int i=1;i<=15;i++)
        { 
            x=x+13;
            y=y-13;
            if(i==15)
            {
                y=y-5;
                System.out.println("y h "+y);
            }
            if ((x==a && y==b) && (c==x && d==y))
            {
                g.setColor(Color.RED);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
            }
            else if(c==x && d==y)
            {
               g.setColor(Color.RED);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
            }
            else if(x==a && y==b)
            {
               g.setColor(Color.BLUE);
               g.drawLine(450, 400,x,y);
               TimeUnit.SECONDS.sleep(1);
            }
            else
            {
                g.setColor(Color.BLACK);
                g.drawLine(450, 400,x,y);
                TimeUnit.SECONDS.sleep(1);
                g.setColor(Color.WHITE);
                g.drawLine(450, 400,x,y);
            }
        }
        if(j==60)
        {
            g.setColor(Color.WHITE);
            g.drawLine(450, 400,c,d);
            if(h<=3)
            {
                c=c+65;
                d=d+65;
                 g.setColor(Color.RED);
                g.drawLine(450, 400,c,d);
            }
            else if(h>3 && h<=6)
            {
                c=c-65;
                d=d+65;
                g.setColor(Color.RED);
                g.drawLine(450, 400,c,d);
                
            }
            else if(h>6 && h<=9)
            {
                c=c-65;
                d=d-65;
                g.setColor(Color.RED);
                g.drawLine(450, 400,c,d);
                
            }
            else
            {
                c=c+65;
                d=d-65;
                g.setColor(Color.RED);
                g.drawLine(450, 400,c,d);
                
            }
            j=1;
                a=450;
                b=200;
        }
    
    }
    } 
     
    catch(Exception e)
    {
    }//x1=+13 y1=0 SECOND 2
        //minutes
        
        //550,65,550,550  400,800,550,500
        //drawCircleByCenter(g, width/2, height/2, width/2); 
        /*Random r = new Random(); Point center = new Point(); center.x=r.nextInt(width/2); center.y=r.nextInt(width/2);*/ 
        //drawCircleByCenter(g, center.x, center.y, width/15); 
    }
}
