import java.awt.*;
import java.awt.event.*;
public class ListExample1
{
    public static void main(String[]args)
    {
        Frame f=new Frame("ListExample1");
        f.setBounds(300,200,550,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            final Label l=new Label();
                            l.setAlignment(Label.CENTER);
                            l.setBounds(20,40,400,50);
                            Button b1=new Button("Show");
                            b1.setBounds(200,150,80,30);
                            final List l1=new List(4,false);
                            l1.setBounds(100,100,70,70);
                            l1.add("C++");
                            l1.add("Java");
                            l1.add("Python");
                            l1.add("Swing");
                            final List l2=new List(4,false);
                            l2.setBounds(100,200,70,70);
                            l2.add("TurboC++");
                            l2.add("Spring");
                            l2.add("Hibernate");
                            l2.add("CodeIgniter");
                            f.add(l1);
                            f.add(l2);
                            f.add(l);
                            f.add(b1);
                            b1.addActionListener(new ActionListener()
                                                 {
                                                     public void actionPerformed(ActionEvent e)
                                                 {
                                                     String data=" Programming Language Selected "+l1.getItem(l1.getSelectedIndex());
                                                     data+=", Framework Selected ";
                                                     for(String frame:l2.getSelectedItems()){
                                                        data+=frame+" ";
                                                     }
                                                     l.setText(data);
                                                 }
                                                 });
    }
}
