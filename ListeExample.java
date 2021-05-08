import javax.swing.*;
public class ListeExample
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("ListExample");
        f.setBounds(200,150,400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<String> l=new DefaultListModel<>();
        l.addElement("Item1");
        l.addElement("Item2");
        l.addElement("Item3");
        l.addElement("Item4");
        JList<String> lt=new JList<>(l);
        lt.setBounds(100,150,120,100);
        f.add(lt);
    }
}
