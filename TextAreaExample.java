import java.awt.*;
import javax.swing.*;
class TextAreaExample extends JFrame
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        TextAreaExample area=new TextAreaExample();
        area.setBounds(10,30,300,300);
        f.add(area);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
