import java.awt.*;
import javax.swing.*;
class MyTextArea
{
    static Container cntr;
    public static void main(String[]args)
    {
        JFrame f=new JFrame(" My TextArea");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200,100,600,500);

        cntr=f.getContentPane();
        cntr.setLayout(null);

        JTextArea textarea=new JTextArea();
        textarea.setBounds(100,50,200,200);
        cntr.add(textarea);

        Font f1=new Font("Arial",Font.BOLD,20);
        textarea.setFont(f1);

    }
}
