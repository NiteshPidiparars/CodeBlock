import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator1
{
    static JLabel l1=new JLabel("Number1");
    static JLabel l2=new JLabel("Number2");
    static JTextField tf1=new JTextField();
    static JTextField tf2=new JTextField();
    static JButton btn1=new JButton("Add");
    static JButton btn2=new JButton("Sub");
    static JButton btn3=new JButton("Mul");
    static JButton btn4=new JButton("Div");
    static JLabel ans=new JLabel("Answer");
    static JTextField atf=new JTextField();
    static JLabel msg=new JLabel("Msg");
    public static void main(String[]args)
    {

        JFrame f=new JFrame("Calculator1");
        f.setBounds(200,100,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cntr=f.getContentPane();
        cntr.setLayout(null);

        l1.setBounds(50,50,70,25);
        l2.setBounds(50,90,70,25);
        tf1.setBounds(130,50,100,25);
        tf2.setBounds(130,90,100,25);
        btn1.setBounds(20,130,80,30);
        btn2.setBounds(110,130,80,30);
        btn3.setBounds(200,130,80,30);
        btn4.setBounds(290,130,80,30);
        ans.setBounds(50,180,70,25);
        atf.setBounds(130,180,100,25);
        msg.setBounds(50,215,300,25);

        btn1.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                              {
                                  btn1_action(e);
                              }
                              });
        btn2.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                              {
                                  btn2_action(e);
                              }
                              });
        btn3.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                              {
                                  btn3_action(e);
                              }
                              });
        btn4.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                              {
                                  btn4_action(e);
                              }
                              });
        cntr.add(l1);
        cntr.add(l2);
        cntr.add(tf1);
        cntr.add(tf2);
        cntr.add(btn1);
        cntr.add(btn2);
        cntr.add(btn3);
        cntr.add(btn4);
        cntr.add(ans);
        cntr.add(atf);
        cntr.add(msg);
    }
    public static void btn1_action(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        float n1=0;
        float n2=0;
        try{
           n1=Float.parseFloat(s1);
           n2=Float.parseFloat(s2);
        }
        catch(Exception ex)
        {
            msg.setText("Please Enter a Valid Number");
        }
        float an=n1+n2;
        String an_tf=Float.toString(an);
        atf.setText(an_tf);
    }
    public static void btn2_action(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        float n1=0;
        float n2=0;
        try{
           n1=Float.parseFloat(s1);
           n2=Float.parseFloat(s2);
        }
        catch(Exception ex)
        {
            msg.setText("Please Enter a Valid Number");
        }
        float an=n1-n2;
        String an_tf=Float.toString(an);
        atf.setText(an_tf);
    }
    public static void btn3_action(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        float n1=0;
        float n2=0;
        try{
           n1=Float.parseFloat(s1);
           n2=Float.parseFloat(s2);
        }
        catch(Exception ex)
        {
            msg.setText("Please Enter a Valid Number");
        }
        float an=n1*n2;
        String an_tf=Float.toString(an);
        atf.setText(an_tf);
    }
    public static void btn4_action(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        float n1=0;
        float n2=0;
        try{
           n1=Float.parseFloat(s1);
           n2=Float.parseFloat(s2);
        }
        catch(Exception ex)
        {
            msg.setText("Please Enter a Valid Number");
        }
        float an=n1/n2;
        String an_tf=Float.toString(an);
        atf.setText(an_tf);
    }
}
