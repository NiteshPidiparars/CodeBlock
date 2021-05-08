import javax.swing.*;
import java.awt.*;
public class JTableExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("JTable Example");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String data[][]={{"100","Sumit","500"},
                         {"101","Nitesh","750"},
                         {"102","Nikhil","450"}};
        String column[]={"ID","NAME","SALARY"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
    }
}
