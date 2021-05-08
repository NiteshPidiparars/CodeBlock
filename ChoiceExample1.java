import java.awt.*;
import java.awt.event.*;
public class ChoiceExample1
{
    public static void main(String[]args)
    {
        Frame f=new Frame("ChoiceExample1 Frame");
        f.setBounds(250,180,450,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            Label l=new Label();
                            l.setAlignment(Label.CENTER);
                            l.setBounds(80,30,350,50);
                            Button b=new Button("Show");
                            b.setBounds(230,150,60,23);
                            Choice c=new Choice();
                            c.setBounds(150,150,75,75);
                            c.add("C");
                            c.add("C++");
                            c.add("Java");
                            c.add("Python");
                            f.add(c);
                            f.add(l);
                            f.add(b);
                            b.addActionListener(new ActionListener()
                                                {
                                                    public void actionPerformed(ActionEvent e)
                                                {
                                                    String data="Programming Language Selected "+c.getItem(c.getSelectedIndex());
                                                    l.setText(data);
                                                }
                                                });
    }
}
