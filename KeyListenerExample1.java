import java.awt.*;
import java.awt.TextArea;
import java.awt.event.*;
public class KeyListenerExample1 extends Frame implements KeyListener
{
    TextArea t;Label l;Frame f;
    KeyListenerExample1()
    {
        f=new Frame("ItemListenerExample1");
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
                            l.setBounds(30,50,300,20);
                            t=new TextArea();
                            t.setBounds(50,80,300,300);
                            t.addKeyListener(this);
                            f.add(l);
                            f.add(t);
    }
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e)
    {
        String text=t.getText();
        String word[]=text.split("\\s");
        l.setText("Words: "+word.length+" Character: "+text.length());
    }
    public void keyTyped(KeyEvent e){}
    public static void main(String[]args)
    {
        new KeyListenerExample1();
    }
}
