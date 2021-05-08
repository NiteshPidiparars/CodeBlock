import java.awt.*;
import javax.swing.*;
public class JScrollPaneExample1
{
    public JScrollPaneExample1()
    {
        JFrame f=new JFrame("JScrollPaneExample1");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea ta=new JTextArea(20,20);
        JScrollPane sp=new JScrollPane(ta);
        //sp.setColumnHeaderView(ta);
        //sp.setRowHeaderView(ta);
        sp.setViewportView(ta);
        //sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        f.getContentPane().add(sp);
        f.setVisible(true);
    }
    public static void main(String[]args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new JScrollPaneExample1();
            }
        });
    }
}
