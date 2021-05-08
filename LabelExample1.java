import java.awt.*;
import java.awt.event.*;
import java.awt.TextField;
class LabelExample1 extends Frame implements ActionListener
{
    Label l;Button btn;TextField tf;
    LabelExample1()
    {
        Frame f=new Frame("My Frame");
        f.setBounds(300,150,450,300);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                    System.exit(0);
                    }
        });
        tf=new TextField();
        tf.setBounds(50,50,120,30);
        l=new Label();
        l.setBounds(50,90,449,30);
        btn=new Button("Click");
        btn.addActionListener(this);
        btn.setBounds(50,130,90,30);
        f.add(tf);
        f.add(l);
        f.add(btn);
    }
    public void actionPerformed(ActionEvent e)
                                {
                                    try
                                    {
                                       String host=tf.getText();
                                       String ip=java.net.InetAddress.getByName(host).getHostAddress();
                                       l.setText("IP Of "+host+" is: "+ip);
                                    }
                                      catch(Exception ex){
                                          System.out.println(ex);
                                }
                            }
    public static void main(String[]args)
    {
        new LabelExample1();
    }
}


