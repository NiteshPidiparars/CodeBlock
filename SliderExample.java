import java.awt.*;
import javax.swing.*;
public class SliderExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("SliderExample");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSlider s=new JSlider(JSlider.HORIZONTAL,0,50,25);
        s.setMinorTickSpacing(2);
        s.setMajorTickSpacing(10);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        JPanel p=new JPanel();
        p.setBounds(50,50,220,50);
        p.add(s);
        f.add(p);
    }
}
