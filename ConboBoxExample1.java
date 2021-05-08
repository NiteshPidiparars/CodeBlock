import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ConboBoxExample1
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("ComboBoxExample1");
        f.setBounds(200,150,450,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l=new JLabel();
        l.setBounds(60,50,300,30);
        String language[]={"C","C++","Java","C#","Python"};
        JComboBox cb=new JComboBox(language);
        cb.setBounds(60,100,120,30);
        JButton btn=new JButton("Show");
        btn.setBounds(220,100,120,30);
        btn.addActionListener(new ActionListener()
                              {
                                  public void actionPerformed(ActionEvent e)
                              {
                                  String data="Programming Language Selected : "+cb.getItemAt(cb.getSelectedIndex());
                                  l.setText(data);
                              }
                              });
                              f.add(l);
                              f.add(cb);
                              f.add(btn);
    }
}
