import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
class TextField1 extends Frame
{
    public static void main(String[]args)
    {
        Frame f=new Frame(" My Frame");
        f.setBounds(350,200,450,350);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        TextField tf1=new TextField("www.Google.com");
        tf1.setBounds(90,70,150,30);
        TextField tf2=new TextField("AWT Event");
        tf2.setBounds(90,120,150,30);
        f.add(tf2);
        f.add(tf1);
    }
}
