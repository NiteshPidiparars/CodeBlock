import java.awt.*;
import javax.swing.*;
public class JRootPaneExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("JRootPaneExample");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRootPane rt=f.getRootPane();
        JMenuBar mb=new JMenuBar();
        JMenu m=new JMenu("File");
        m.add("Open");
        m.add("close");
        mb.add(m);
        rt.setJMenuBar(mb);
        rt.getContentPane().add(new JButton("Press Here"));
        f.setVisible(true);
    }
}
