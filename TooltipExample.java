import java.awt.*;
import javax.swing.*;
public class TooltipExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("ToolTipExample");
        f.setBounds(250,150,400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l=new JLabel("Name : ");
        l.setBounds(50,70,70,30);
        JPasswordField pf=new JPasswordField();
        pf.setBounds(120,70,100,30);
        pf.setToolTipText("Enter your Name");
        JLabel l1=new JLabel("Password : ");
        l1.setBounds(50,120,70,30);
        JPasswordField pf1=new JPasswordField();
        pf1.setBounds(120,120,100,30);
        pf1.setToolTipText("Enter your password");
        f.add(l);
        f.add(pf);
        f.add(l1);
        f.add(pf1);
        f.setVisible(true);
    }
}
