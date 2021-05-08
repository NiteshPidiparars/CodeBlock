import java.awt.*;
import javax.swing.*;
class CanvasExample1 extends Canvas
{
    public void paint(Graphics g)
    {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Image.JPG");
        g.drawImage(i,10,10,this);
    }
    public static void main(String[]args)
    {
        CanvasExample1 cv1=new CanvasExample1();
        JFrame f=new JFrame("Canvas Example1");
        f.add(cv1);
        f.setBounds(450,120,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
