import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CardLayoutDemo extends JFrame implements ActionListener
{
    CardLayout card;
    Container c;
    CardLayoutDemo()
    {
        card=new CardLayout(40,30);
        c=getContentPane();
        c.setLayout(card);
        JButton b1=new JButton("card 1");
        JButton b2=new JButton("card 2");
        JButton b3=new JButton("card 3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);
    }
    public void actionPerformed(ActionEvent e)
    {
        card.next(c);
    }
    public static void main(String[]args)
    {
        CardLayoutDemo cl=new CardLayoutDemo();
        cl.setBounds(400,130,400,400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
