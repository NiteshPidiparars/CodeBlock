import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
public class IPFinder extends JFrame implements ActionListener
{
    JFrame f;JLabel l;JTextField tf;JButton btn;
    IPFinder()
    {
        f=new JFrame("IP Finder");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //super("IP Finder tool-Java tPoint");
        l=new JLabel("Enter URL: ");
        l.setBounds(70,70,150,30);
        tf=new JTextField();
        tf.setBounds(70,110,150,30);
        btn=new JButton("Find IP");
        btn.setBounds(70,150,100,30);
        btn.addActionListener(this);
        f.add(l);
        f.add(tf);
        f.add(btn);
    }
    public void actionPerformed(ActionEvent e)
    {
        String url=tf.getText();
        try
        {
            InetAddress ia=InetAddress.getByName(url);
            String ip=ia.getHostAddress();
            JOptionPane.showMessageDialog(this,ip);
        }
        catch(UnknownHostException e1){
        JOptionPane.showMessageDialog(this,e1.toString());
        }
    }
    public static void main(String[]args)
    {
        new IPFinder();
    }
}
