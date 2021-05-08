import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SeparatorExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("SeparatorExample");
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
                            JMenuBar mb=new JMenuBar();
                            JMenu m=new JMenu("Menu");
                            JMenuItem i1=new JMenuItem("Item1");
                            JMenuItem i2=new JMenuItem("Item2");
                            m.add(i1);
                            m.add(i2);
                            m.addSeparator();
                            mb.add(m);
                            f.setJMenuBar(mb);
    }
}
