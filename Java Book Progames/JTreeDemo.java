import java.util.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
public class JTreeDemo
{
    public static void main(String[]args)
    {
        JFrame f = new JFrame("JTree Demo");
        Container c = f.getContentPane();
        f.setLayout(new FlowLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Computer");
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("HDD");
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("CPU");
        DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("Mouse");
        root.add(c1);root.add(c2);root.add(c3);
        c1.add(new DefaultMutableTreeNode("Seagate"));
        c1.add(new DefaultMutableTreeNode("Samsung"));
        c2.add(new DefaultMutableTreeNode("Intel"));
        c2.add(new DefaultMutableTreeNode("IBM"));
        c3.add(new DefaultMutableTreeNode("Dell"));
        c3.add(new DefaultMutableTreeNode("Hp"));
        JTree t = new JTree(root);
        c.add(t);
        f.pack();
        f.setVisible(true);
    }
}
