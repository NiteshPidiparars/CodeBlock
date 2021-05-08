import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class ViewPortClass2
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame ("ViewPortClass2");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel();
        label.setPreferredSize(new Dimension(1000,1000));
        JScrollPane sp=new JScrollPane(label);

        JButton btn=new JButton();
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setViewportBorder(new LineBorder(Color.RED));
        sp.getViewport().add(btn,null);
        f.add(sp,BorderLayout.CENTER);
    }
}
