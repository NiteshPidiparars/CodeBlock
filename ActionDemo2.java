import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ActionDemo2
{
    static Container c;
    public static void main(String[]args)
    {
        JFrame frame=new JFrame("Action Demo using a saprate class");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,700,500);

        c=frame.getContentPane();
        c.setLayout(null);

        JButton red=new JButton("RED");
        red.setBounds(100,50,100,40);
        RedListenerClass redListener=new RedListenerClass ();
        red.addActionListener(redListener);

        JButton yellow=new JButton("YELLOW");
        yellow.setBounds(250,50,100,40);
        YellowListenerClass YellowListener=new YellowListenerClass ();
        yellow.addActionListener(YellowListener);

        JButton pink=new JButton("PINK");
        pink.setBounds(400,50,100,40);
        pinkListenerClass pinkListener=new pinkListenerClass ();
        pink.addActionListener(pinkListener);


        c.add(red);
        c.add(yellow);
        c.add(pink);
    }
}
class RedListenerClass implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
      ActionDemo2.c.setBackground(Color.RED);
    }
}
class YellowListenerClass implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
      ActionDemo2.c.setBackground(Color.YELLOW);
    }
}
class pinkListenerClass implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
      ActionDemo2.c.setBackground(Color.PINK);
    }
}
