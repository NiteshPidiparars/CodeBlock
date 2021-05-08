import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SeparatorExample1
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("SeparatorExample");
        f.setBounds(200,150,300,120);
        f.setVisible(true);
        f.setLayout(new GridLayout(0,1));
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            JLabel l1=new JLabel("Above Separator");
                            JSeparator sp=new JSeparator();
                            JLabel l2=new JLabel("Below Separator");
                            f.add(l1);
                            f.add(sp);
                            f.add(l2);
    }
}
