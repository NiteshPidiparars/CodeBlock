import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
public class MenuBarExample
{
    public static void CreateAndShowGUI()
    {
        JFrame f=new JFrame("MenuBarExample");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb=new JMenuBar();
        mb.setOpaque(true);
        mb.setBackground(new Color(154,165,127));
        mb.setPreferredSize(new Dimension(200,20));
        JLabel l=new JLabel();
        mb.setOpaque(true);
        mb.setBackground(new Color(248,213,231));
        mb.setPreferredSize(new Dimension(200,180));
        f.setJMenuBar(mb);
        f.getContentPane().add(l,BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[]args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
                                               {
                                                   public void run()
                                               {
                                                   CreateAndShowGUI();
                                               }
                                               });
    }
}
