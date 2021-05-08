import java.awt.*;
import java.awt.event.*;
class CheckBoxGroupExample
{
    public static void main(String[]args)
    {
        Frame f=new Frame("My Frame");
        f.setBounds(350,120,450,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            CheckboxGroup cbg=new CheckboxGroup();
                            Checkbox cb1=new Checkbox("C++",cbg,false);
                            cb1.setBounds(200,130,80,50);
                            Checkbox cb2=new Checkbox("Java",cbg,true);
                            cb2.setBounds(200,180,80,50);
                            f.add(cb1);
                            f.add(cb2);
    }
}
