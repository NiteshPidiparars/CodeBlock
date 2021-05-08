import java.awt.*;
import java.awt.event.*;
public class MouseMotionListenerExample extends Frame implements MouseMotionListener
{
    Frame f;
   MouseMotionListenerExample()
    {
        f=new Frame("MouseMotionListenerExample");
        f.setBounds(200,150,300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            f.addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent e)
    {
        Graphics g=f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public void mouseMoved(MouseEvent e){}
    public static void main(String[]args)
     {
         new MouseMotionListenerExample();
     }
}
