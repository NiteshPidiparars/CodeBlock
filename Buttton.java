import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
class Buttton extends Frame
{
    public static void main(String[]args)
    {
        Frame f=new Frame("My Frame");
        f.setBounds(400,200,500,300);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent e)
    	{
    		System.exit(0);
    	}
        });
        TextField tf=new TextField();
        tf.setBounds(50,50,150,20);
        Button b=new Button("Click ME");
        b.setBounds(50,90,80,30);
        b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           tf.setText("Welcome to India");
           }
        });
        f.add(b);
        f.add(tf);
    }
}
