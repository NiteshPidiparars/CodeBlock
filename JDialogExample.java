import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JDialogExample
{
    private static JDialog d;
    JDialogExample()
    {
        JFrame f=new JFrame("DialogExample");
        f.setBounds(250,150,400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        d=new JDialog(f,"DialogExample",true);
        d.setLayout(new FlowLayout());
        JButton btn=new JButton("OK");
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JDialogExample.d.setVisible(false);
            }
        });
        d.add(new JLabel("Click Button to Continue..."));
        d.add(btn);
        f.add(d);
    }
    public static void main(String args[])
    {
        new JDialogExample();
    }
}
