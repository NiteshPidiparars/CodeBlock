import java.applet.Applet;
import java.awt.*;
/*<applet code="MyApplet1" width="300" height="220">
<param name="site" value="www.mySirG.com"/>
</applet>*/
public class MyApplet1 extends Applet
{
    private String defaultMessage="Hello!";
    public void paint(Graphics g)
    {
        String s1=getParameter("site");
        if(s1==null)
            s1=defaultMessage;
        g.drawString(s1,50,25);
    }
}
