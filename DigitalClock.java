import java.awt.*;
import java.applet.Applet;
import java.util.*;
import java.text.*;
/*<applet code="DigitalClock" width="300" height="300"> </applet>*/
public class DigitalClock extends Applet implements Runnable
{
    Thread t;
    int hour=0,minute=0,second=0;
    String timeString="";
    public void init()
    {
        setBackground(Color.red);
    }
    public void start()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        try
        {
           while(true)
            {
            Calendar cal=Calendar.getInstance();
            hour=cal.get(Calendar.HOUR_OF_DAY);
            if(hour>12)
                hour=-12;
            minute=cal.get(Calendar.MINUTE);
            second=cal.get(Calendar.SECOND);
            SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
            Date date=cal.getTime();
            timeString=f.format(date);
            repaint();
            t.sleep(1000);//interval give in millisecond
           }
        }
        catch(Exception e){}
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString(timeString,50,50);
    }
}
