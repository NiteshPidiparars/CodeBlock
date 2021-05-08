import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginFrame extends JFrame implements ActionListener
{
    Container c;
    JLabel userlabel=new JLabel("Username");
    JLabel passlabel=new JLabel("Password");
    JTextField user_tf=new JTextField();
    JPasswordField pass_pf=new JPasswordField();
    JButton login_btn=new JButton("Login");
    LoginFrame()
    {
       c=this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.YELLOW);

       userlabel.setBounds(100,50,100,40);
       passlabel.setBounds(100,150,100,40);

       Font f=new Font("Arial",Font.BOLD,20);
       userlabel.setFont(f);
       passlabel.setFont(f);

       user_tf.setBounds(250,50,150,40);
       pass_pf.setBounds(250,150,150,40);
       user_tf.setFont(f);
       pass_pf.setFont(f);

       login_btn.setBounds(100,250,100,40);
       login_btn.setFont(f);
       login_btn.addActionListener(this);

       c.add(userlabel);
       c.add(passlabel);
       c.add(user_tf);
       c.add(pass_pf);
       c.add(login_btn);
    }
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource()==login_btn)
        {
            String username=user_tf.getText();//given by user
            String password=pass_pf.getText();
            if(username.equals("ABC") && password.equals("123"))
            {
                c.setBackground(Color.GREEN);
                c.remove(wrn);
            }
            else
            {
                c.setBackground(Color.RED);
                wrn.setBounds(100,300,200,40);
                c.add(wrn);
            }
        }
    }
    JLabel wrn=new JLabel("Wrong Username and Password");
}
class LoginFormDemo
{
    public static void main(String[]args)
    {
       LoginFrame f=new LoginFrame();
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setBounds(300,50,700,500);
    }
}
