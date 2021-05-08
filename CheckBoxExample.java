import java.awt.*;
import java.awt.Checkbox;
import java.awt.event.*;
class CheckBoxExample extends Frame
{
    public static void main(String[]args)
    {
        Frame f=new Frame("My Frame");
        f.setBounds(250,130,450,300);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
            {
            public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
        Checkbox cb1=new Checkbox(" C++");
        cb1.setBounds(150,50,50,50);
        Checkbox cb2=new Checkbox(" Java");
        cb2.setBounds(150,100,50,50);
        f.add(cb1);
        f.add(cb2);
    }
}
