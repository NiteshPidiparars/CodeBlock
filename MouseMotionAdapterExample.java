import java.awt.*;
import java.awt.event.*;
public class MouseMotionAdapterExample extends MouseMotionAdapter
{
    Frame f;
    public MouseMotionAdapterExample()
    {
        f=new Frame("MouseMotionAdapterExample");
        f.setBounds(200,150,400,400);
        f.setLayout(null);
        f.setVisible(true);
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
        g.setColor(Color.YELLOW);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public static void main(String[]args)
    {
        new MouseMotionAdapterExample();
    }
}
