import java.awt.*;
import java.awt.event.*;
public class WindowListenerExample extends Frame implements WindowListener
{
    WindowListenerExample()
    {
        Frame f=new Frame("WindowListenerExample");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(this);
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Opened");
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Closed");
    }
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Closing");
        dispose();
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("Activated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("Deactivated");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Deiconified");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Iconified");
    }
    public static void main(String[]args)
    {
        new WindowListenerExample();
    }
}
