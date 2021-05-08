import java.awt.*;
import javax.swing.*;
public class JEditorPaneExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("JEditorPaneExample");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JEditorPane ep=new JEditorPane();
        ep.setContentType("text/html");
        ep.setText("<h1>Sleeping</h1><p>is necessary for healthy body."
                   +"But Sleeping is unnecessary times may spoil our health,wealth and studies."
                   +"Doctor advice that the sleeping in improper timings may lead for obesity during the student days</p>");
        f.setContentPane(ep);
        f.setVisible(true);
    }
}
