import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener
{
    Frame f;Label l;
    MouseListenerExample()
    {
        f=new Frame("Mouse Listener");
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
                            l=new Label();
                            l.setBounds(100,100,120,30);
                            f.addMouseListener(this);
                            f.add(l);
    }
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse Released");
    }
    public static void main(String[]args)
    {
        new MouseListenerExample();
    }
}
