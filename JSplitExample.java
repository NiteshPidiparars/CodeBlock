import java.awt.*;
import javax.swing.*;
public class JSplitExample
{
    private static void createAndShow()
    {
        JFrame f=new JFrame("JSplitExample");
        f.setBounds(250,150,400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] option1={"A","B","C","D","E"};
        JComboBox b1=new JComboBox(option1);
        String[] option2={"1","2","3","4","5"};
        JComboBox b2=new JComboBox(option2);
        JPanel p1=new JPanel();
        p1.add(b1);
        JPanel p2=new JPanel();
        p2.add(b2);
        //JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        JSplitPane sp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,p1,p2);
        f.getContentPane().add(sp);
    }
    public static void main(String[]args)
    {
        //Schedule a job for a event-dispatching thread:
        //Creating and Showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable()
                                               {
                                                   public void run()
                                               {
                                                   createAndShow();
                                               }
                                               });
    }
}
