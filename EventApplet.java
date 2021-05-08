import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.TextField;
import java.awt.event.*;
/*<applet code="EventApplet" width="400" height="400"> </applet>*/
public class EventApplet extends Applet implements ActionListener
{
    Button btn;
    TextField tf;
    public void init()
    {
        tf=new TextField();
        tf.setBounds(100,100,150,30);
        btn=new Button("Click");
        btn.setBounds(100,150,80,30);
        add(btn);
        add(tf);
        btn.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome to Applet");
    }
}
