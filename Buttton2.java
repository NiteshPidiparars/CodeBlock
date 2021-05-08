import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;
class Buttton2 extends Frame implements ActionListener
{
    TextField tf;Button btn;
    Buttton2()
    {
        Frame f=new Frame("My Frame");
        f.setBounds(300,150,450,300);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        tf=new TextField();
        tf.setBounds(50,50,120,30);
        btn=new Button("Click");
        btn.setBounds(50,99,90,30);
        btn.addActionListener(this);
        f.add(tf);
        f.add(btn);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome to India");
    }
    public static void main(String[]args)
    {
        new Buttton2();
    }
}
