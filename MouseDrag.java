import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="MouseDrag" width="400" height="400"> </applet>*/
public class MouseDrag extends Applet implements MouseMotionListener
{
    public void init()
    {
        addMouseMotionListener(this);
        setBackground(Color.red);
    }
    public void mouseDragged(MouseEvent e)
    {
        Graphics g=getGraphics();
        g.setColor(Color.white);
        g.fillOval(e.getX(),e.getY(),5,5);
    }
    public void mouseMoved(MouseEvent e)
    {

    }
}
