import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ListExample2
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("ListExample2");
        f.setBounds(200,150,500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel l=new JLabel();
        l.setBounds(50,30,500,30);
        JButton btn=new JButton("Show");
        btn.setBounds(200,140,100,30);
        DefaultListModel<String> l1=new DefaultListModel<>();
        l1.addElement("India");
        l1.addElement("Australia");
        l1.addElement("America");
        l1.addElement("UAE");
        final JList<String> lt=new JList<>(l1);
        lt.setBounds(50,60,120,80);
        DefaultListModel<String> l2=new DefaultListModel<>();
        l2.addElement("C");
        l2.addElement("C++");
        l2.addElement("JAVA");
        l2.addElement("PHP");
        final JList<String> lt1=new JList<>(l2);
        lt1.setBounds(50,170,120,80);
        f.add(l);
        f.add(lt);
        f.add(lt1);
        f.add(btn);
        btn.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                              {
                                  String data="";
                                  if(lt.getSelectedIndex()!=-1){
                                    data=" Programming Language Selected : "+lt.getSelectedValue();
                                    l.setText(data);
                                  }
                                  if(lt1.getSelectedIndex()!=-1){
                                    data+=" , FrameWork Selected: ";
                                    for(Object frame : lt1.getSelectedValues()){
                                        data+=frame+"";
                                    }
                                  }
                                  l.setText(data);
                              }
                              });
    }
}
