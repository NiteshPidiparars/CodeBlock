import java.awt.*;
import java.awt.TextArea;
import java.awt.event.*;
class TextAreaEP1 extends Frame implements ActionListener
{
    Label l1,l2;TextArea area;Button b;
    TextAreaEP1()
    {
        Frame f=new Frame("My Frame");
        f.setBounds(300,150,480,430);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter()
            {
            public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
        l1=new Label();
        l1.setBounds(40,40,80,30);
        l2=new Label();
        l2.setBounds(280,40,150,30);
        area=new TextArea("Welcome to JavaToPoint",10,20);
        area.setBounds(40,70,400,270);
        b=new Button("Count Words");
        b.setBounds(180,340,100,30);
        b.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
    }
    public void actionPerformed(ActionEvent e)
    {
        String text=area.getText();
        String words[]=text.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Characters: "+text.length());
    }
    public static void main(String[]args)
    {
        new TextAreaEP1();
    }
}
