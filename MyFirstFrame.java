import javax.swing.*;
import java.awt.*;
public class MyFirstFrame
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JFrame");
        ImageIcon icon=new ImageIcon("IMAGE.JPG");
        f.setIconImage(icon.getImage());

        Container ctr=f.getContentPane();
        ctr.setBackground(Color.ORANGE);
        f.setResizable(false);
    }
}
