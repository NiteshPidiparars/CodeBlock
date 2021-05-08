import java.awt.*;
import java.awt.event.*;
public class ItemListenerExample extends Frame implements ItemListener
{
    Frame f;Label l;Checkbox cb1,cb2;
    ItemListenerExample()
    {
        f=new Frame("ItemListenerExample");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            l=new Label();
                            l.setBounds(150,60,160,30);
                            cb1=new Checkbox("C++");
                            cb1.setBounds(150,110,100,30);
                            cb1.addItemListener(this);
                            cb2=new Checkbox("Java");
                            cb2.setBounds(150,150,100,30);
                            cb2.addItemListener(this);
                            f.add(l);
                            f.add(cb1);
                            f.add(cb2);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==cb1)
            l.setText("C++ CheckBox: "+(e.getStateChange()==1?"checked":"unchecked"));
        if(e.getSource()==cb2)
            l.setText("Java CheckBox: "+(e.getStateChange()==1?"checked":"unchecked"));
    }
    public static void main(String[]args)
    {
        new ItemListenerExample();
    }
}
