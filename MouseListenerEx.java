import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class MouseListenerEx extends Frame implements MouseListener
{
    Frame f;
    MouseListenerEx()
    {
        f=new Frame();
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
                            f.addMouseListener(this);
    }
                            public void mouseClicked(MouseEvent e)
                            {
                                Graphics g=getGraphics();
                                g.setColor(Color.BLUE);
                                g.fillOval(e.getX(),e.getY(),30,30);
                            }
                            public void mouseEntered(MouseEvent e){}
                            public void mouseExited(MouseEvent e){}
                            public void mousePressed(MouseEvent e){}
                            public void mouseReleased(MouseEvent e){}
                            public static void main(String[]args){
                            new MouseListenerExample1();
                            }
}
