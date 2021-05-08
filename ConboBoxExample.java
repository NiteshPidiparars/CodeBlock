import javax.swing.*;
public class ConboBoxExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("ComboBox Example");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String cuntry[]={"India","Pakistan","America","Australia","Peria"};
        JComboBox cb=new JComboBox(cuntry);
        cb.setBounds(100,100,120,30);
        f.add(cb);
    }
}
