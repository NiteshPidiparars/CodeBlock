import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample1 extends Frame implements MouseListener
{
    Frame f;
    MouseListenerExample1()
    {
        f=new Frame("MouseListenerExample1");
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
                            f.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        Graphics g=f.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(),e.getY(),30,30);
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public static void main(String[]args)
    {
        new MouseListenerExample1();
    }
}
