import java.awt.*;
import java.awt.event.*;
public class Paint extends Frame implements MouseMotionListener
{
    Frame f;Label l;
    Paint()
    {
        f=new Frame("Paint");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            l=new Label();
                            l.setBounds(20,40,100,30);
                            Color c=Color.BLUE;
                            f.addMouseMotionListener(this);
                            f.add(l);
    }
    public void mouseDragged(MouseEvent e)
    {
        l.setText("X= "+e.getX()+",Y= "+e.getY());
        Graphics g=f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public void mouseMoved(MouseEvent e)
    {
        l.setText("X= "+e.getX()+",Y= "+e.getY());
    }
    public static void main(String[]args)
    {
        new Paint();
    }
}
