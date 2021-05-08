import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AD1
{
    static Container c;
    public static void main(String[]args)
    {
        JFrame frame=new JFrame("Action Demo using Anonymous inner class");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,700,500);

        c=frame.getContentPane();
        c.setBackground(Color.YELLOW);
        c.setLayout(null);

        JButton red=new JButton("RED");
        red.setBounds(100,50,100,30);

        red.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent event)
             {
                redButtonAction(event);
             }
        });

        JButton yellow=new JButton("YELLOW");
        yellow.setBounds(250,50,100,30);

        yellow.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent event)
             {
                yellowButtonAction(event);
             }
        });

        JButton green=new JButton("GREEN");
        green.setBounds(400,50,100,30);

        green.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent event)
             {
                greenButtonAction(event);
             }
        });

        c.add(red);
        c.add(yellow);
        c.add(green);
    }
    static void redButtonAction(ActionEvent event)
    {
        c.setBackground(Color.RED);
    }
    static void yellowButtonAction(ActionEvent event)
    {
        c.setBackground(Color.YELLOW);
    }
    static void greenButtonAction(ActionEvent event)
    {
        c.setBackground(Color.GREEN);
    }
}

