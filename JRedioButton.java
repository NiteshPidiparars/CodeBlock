import javax.swing.*;
public class JRedioButton
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("JRedioButton");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton rb1=new JRadioButton("A)Male");
        rb1.setBounds(100,100,100,30);
        JRadioButton rb2=new JRadioButton("B)Female");
        rb2.setBounds(100,130,100,30);
        ButtonGroup bp=new ButtonGroup();
        bp.add(rb1);
        bp.add(rb2);
        f.add(rb1);
        f.add(rb2);
    }
}
