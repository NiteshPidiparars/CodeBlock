import java.awt.*;
import java.awt.event.*;
class LabelExample extends Frame
{
    public static void main(String[]args)
    {
        Frame f=new Frame("My Frame");
        f.setBounds(250,150,400,250);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                            System.exit(0);
            }
        });
        Label l=new Label("First Label");
        l.setBounds(50,50,60,50);
        Label l1=new Label("Second Label");
        l1.setBounds(50,50,100,130);
        f.add(l);
        f.add(l1);
    }
}
