import java.awt.*;
import java.awt.Checkbox;
import java.awt.event.*;
class CheckBoxExample1 extends Frame
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
        Label l=new Label();
        l.setAlignment(Label.CENTER);
        l.setSize(400,100);
        Checkbox cb1=new Checkbox(" C++");
        cb1.setBounds(180,80,50,50);
        Checkbox cb2=new Checkbox(" Java");
        cb2.setBounds(180,130,50,50);
        f.add(cb1);
        f.add(cb2);
        f.add(l);
        cb1.addItemListener(new ItemListener()
                            {
                                public void itemStateChanged(ItemEvent e)
                            {
                                l.setText(" C++ CheckBok: "+(e.getStateChange()==1?"checked":"unchecked"));
                            }
                            });
        cb2.addItemListener(new ItemListener()
                            {
                                public void itemStateChanged(ItemEvent e)
                            {
                                l.setText(" Java CheckBok: "+(e.getStateChange()==1?"checked":"unchecked"));
                            }
                            });
    }
}
