import java.awt.*;
import javax.swing.*;
class JTableDemo
{
    JFrame f;
    JTableDemo()
    {
        f=new JFrame("JTableDemo");
        f.setBounds(250,150,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String data[][]={
                        {"101","ABC","10000"},
                        {"102","DEF","20000"},
                        {"103","GHI","30000"}};
        String column[]={"ID","NAME","SALARY"};
        JTable tb=new JTable(data,column);
        tb.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(tb);
        f.add(sp);
        f.setVisible(true);
    }
    public static void main(String[]arge)
    {
        new JTableDemo();
    }
}
