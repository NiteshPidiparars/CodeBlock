import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
class TextField2 extends Frame implements ActionListener
{
    TextField tf1,tf2,tf3;Button b1,b2,b3,b4;
    TextField2()
    {
        Frame f=new Frame(" My Frame");
        f.setBounds(350,150,350,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        Label l1=new Label("FIRST");
        l1.setBounds(50,70,200,30);
        Label l2=new Label("SECOND");
        l2.setBounds(30,120,200,30);
        Label l3=new Label("TOTAL");
        l3.setBounds(45,170,200,30);
        tf1=new TextField();
        tf1.setBounds(90,70,200,30);
        tf2=new TextField();
        tf2.setBounds(90,120,200,30);
        tf3=new TextField();
        tf3.setBounds(90,170,200,30);
        tf3.setEditable(false);
        b1=new Button("+");
        b1.setBounds(90,230,80,50);
        b2=new Button("-");
        b2.setBounds(210,230,80,50);
        b3=new Button("*");
        b3.setBounds(90,300,80,50);
        b4=new Button("/");
        b4.setBounds(210,300,80,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l1);
        f.add(l2);
        f.add(l3);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        }
        else if(e.getSource()==b3){
            c=a*b;
        }
        else if(e.getSource()==b4){
            c=a/b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String[]args)
    {
        new TextField2();
    }
}

