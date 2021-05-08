import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.JTextArea;
import javax.swing.*;
public class MyToolBar
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("JTool Bar");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToolBar tb=new JToolBar();
        tb.setRollover(true);
        JButton btn=new JButton("File");
        tb.add(btn);
        tb.addSeparator();
        tb.add(new JButton("Edit"));
        tb.add(new JComboBox(new String[]{"opt-1","opt-2","opt-3","opt-4"}));
        Container cntr=f.getContentPane();
        cntr.add(tb,BorderLayout.NORTH);
        JTextArea ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        cntr.add(sp,BorderLayout.EAST);

    }
}

