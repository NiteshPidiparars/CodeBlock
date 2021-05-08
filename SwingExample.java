import java.awt.event.*;
import javax.swing.*;
public class SwingExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("SwingExample");
        f.setBounds(200,150,300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("Addition of two number");
        l1.setBounds(50,50,200,20);
        JLabel l2=new JLabel("First number");
        l2.setBounds(50,80,100,20);
        JLabel l3=new JLabel("Second number");
        l3.setBounds(50,130,100,20);
        JLabel l4=new JLabel();
        l4.setBounds(50,160,200,20);
        JTextField t1=new JTextField();
        t1.setBounds(150,80,100,20);
        JTextField t2=new JTextField();
        t2.setBounds(150,130,100,20);
        JButton b=new JButton("Add");
        b.setBounds(80,180,100,20);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(b);
        f.add(l4);
        b.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
                                {
                                    int a=Integer.parseInt(t1.getText());
                                    int b=Integer.parseInt(t2.getText());
                                    int s=a+b;
                                    l4.setText("Sum is: "+s);
                                }
        });
        }
}
