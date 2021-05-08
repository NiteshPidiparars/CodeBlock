import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyComponent extends JComponent
{
    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(100,100,200,200);
    }
}
public class JComponentExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("JComponent Example");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyComponent com=new MyComponent();
        JFrame.setDefaultLookAndFeelDecorated(true);
        f.add(com);
    }
}
