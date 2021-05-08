import java.awt.*;
import javax.swing.*;
class CanvasExample extends Canvas
{
    public void print(Graphics g)
    {
    Toolkit t=Toolkit.getDefaultToolkit();
    Image i=t.getImage("Image.JPG");
    g.drawImage(i,10,10,this);
    }
    public static void main(String[]args)
    {
        CanvasExample m=new CanvasExample();
        JFrame f=new JFrame("CanvasExample");
        f.add(m);
        f.setSize(200,150,300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
