import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
public class JTextPaneExample
{
    public static void main(String[]args)throws BadLocationException
    {
        JFrame f=new JFrame("JTextPaneExample");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cntr=f.getContentPane();
        SimpleAttributeSet attribute=new SimpleAttributeSet();
        StyleConstants.setBold(attribute,true);
        JTextPane tp=new JTextPane();
        tp.setCharacterAttributes(attribute,true);
        tp.setText("Welcome");

        attribute=new SimpleAttributeSet();
        StyleConstants.setItalic(attribute,true);
        StyleConstants.setForeground(attribute,Color.red);
        StyleConstants.setBackground(attribute,Color.blue);

        Document doc=tp.getStyledDocument();
        doc.insertString(doc.getLength(),"In Java",attribute);

        attribute=new SimpleAttributeSet();
        doc.insertString(doc.getLength(),"World",attribute);

        JScrollPane sp=new JScrollPane(tp);
        cntr.add(sp,BorderLayout.CENTER);
    }
}
