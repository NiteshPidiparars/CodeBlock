import java.awt.*;
import java.awt.event.*;
class CheckBoxGroupExample1
{
    public static void main(String[]args)
    {
        Frame f=new Frame("CheckBox ");
        f.setBounds(350,150,450,400);
        f.setLayout(null);
        f.setVisible(true);
        Label l=new Label();
        l.setBounds(140,40,200,50);
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
                            f.add(l);
                            cb1.addItemListener(new ItemListener()
                                                {
                                                    public void itemStateChanged(ItemEvent e)
                                                {
                                                    l.setText("C++ CheckBox: Checked");
                                                }
                                                });
                                                cb2.addItemListener(new ItemListener()
                                                {
                                                    public void itemStateChanged(ItemEvent e)
                                                {
                                                    l.setText("Java CheckBox: Checked");
                                                }
                                                });
    }
}
