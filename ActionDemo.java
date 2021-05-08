import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
    JButton btn1=new JButton("RED");
    JButton btn2=new JButton("YELLOW");
    JButton btn3=new JButton("GREEN");
    Container c;
    MyFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);

        btn1.setBounds(100,50,100,50);
        btn2.setBounds(250,50,100,50);
        btn3.setBounds(400,50,100,50);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
    }
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==btn1)
       {
           c.setBackground(Color.RED);
       }
       if(e.getSource()==btn2)
       {
           c.setBackground(Color.YELLOW);
       }
       if(e.getSource()==btn3)
       {
           c.setBackground(Color.GREEN);
       }
    }
}

class ActionDemo
{
    public static void main(String[]args)
    {
        MyFrame f=new MyFrame();
        f.setTitle("Action Demo");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,50,700,500);
    }
}
