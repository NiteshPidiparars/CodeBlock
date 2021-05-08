import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class OptionPaneExample2
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("OptionPaneExample");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane op=new JOptionPane();
        String name=JOptionPane.showInputDialog(f,"Enter name");
        f.add(op);
    }
}
