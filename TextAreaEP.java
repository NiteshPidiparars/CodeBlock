import java.awt.*;
import java.awt.TextArea;
import java.awt.event.*;
class TextAreaEP
{
    public static void main(String[]args)
    {
        Frame f=new Frame("My Frame");
        f.setBounds(350,130,450,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        TextArea t=new TextArea("Welcome to JavaTPoint");
        t.setBounds(30,40,390,330);
        f.add(t);
    }
}

