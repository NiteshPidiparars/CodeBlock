import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JRedioButton1 extends JFrame implements ActionListener
{
    JFrame f;JRadioButton r1,r2;JButton btn;
    JRedioButton1()
    {
        f=new JFrame("JRedioButton1");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        r1=new JRadioButton("A)Male");
        r1.setBounds(100,100,100,30);
        r2=new JRadioButton("B)Female");
        r2.setBounds(100,130,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        btn=new JButton("Click");
        btn.setBounds(100,170,100,30);
        btn.addActionListener(this);
        f.add(r1);
        f.add(r2);
        f.add(btn);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected()){
            JOptionPane.showMessageDialog(this,"you are male");
        }
        if(r2.isSelected()){
            JOptionPane.showMessageDialog(this,"you are female");
        }
    }
    public static void main(String[]args)
    {
        new JRedioButton1();
    }
}
