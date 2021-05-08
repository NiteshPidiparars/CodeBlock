import java.awt.*;
import javax.swing.*;
class MyCheckBox
{
    public static void main(String[]args)
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,700,500);

        Container cntr=frame.getContentPane();
        cntr.setLayout(null);

        JCheckBox cb1=new JCheckBox("JButton");
        cb1.setBounds(150,50,100,40);

        Font f=new Font("Arial",Font.BOLD,20);
        cb1.setFont(f);

        cb1.setEnabled(true);
        cb1.setSelected(true);

        cntr.add(cb1);

    }
}


