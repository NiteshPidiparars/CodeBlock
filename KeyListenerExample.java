import java.awt.*;
import java.awt.TextArea;
import java.awt.event.*;
public class KeyListenerExample extends Frame implements KeyListener
{
    TextArea t;Label l;Frame f;
    KeyListenerExample()
    {
        f=new Frame("ItemListenerExample");
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
                            l.setBounds(50,50,100,20);
                            t=new TextArea();
                            t.setBounds(50,80,300,300);
                            t.addKeyListener(this);
                            f.add(l);
                            f.add(t);
    }
    public void keyPressed(KeyEvent e)
    {
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e)
    {
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e)
    {
        l.setText("Key Typed");
    }
    public static void main(String[]args)
    {
        new KeyListenerExample();
    }
}
