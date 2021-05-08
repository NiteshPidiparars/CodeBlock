import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
public class FSTreeDemo {
    public static void main(String[]args){
        JFrame f = new JFrame("FSTreeDemo");
        f.setSize(300,300);
        FSTreeModel model = new FSTreeModel("E:/");
        JTree tree = new JTree();
        tree.setModel(model);
        JScrollPane jsp = new JScrollPane(tree);
        f.getContentPane().add(jsp);
        f.setVisible(true);
    }
}
class FSTreeModel implements TreeModel{
    File root;
    public FSTreeModel(String path){
        this.root = new File(path);
    }
    @Override
    public Object getRoot() {
        return root;
    }
    @Override
    public Object getChild(Object parent, int index) {
        String[] c = ((File)parent).list();
        return (c == null)|| (index >= c.length)?null:new File((File)parent,c[index]);
    }

    @Override
    public int getChildCount(Object parent) {
        String[] c = ((File)parent).list();
        return c!=null?c.length:0;
    }
    @Override
    public boolean isLeaf(Object node) {
        return ((File)node).isFile();
    }
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {}
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        String[] l = ((File)parent).list();
        if(l == null)
            return -1;
        String name = ((File)child).getName();
        for(int i=0;i<l.length;i++)
            if(name.equals(l[i]))
                return i;
        return -1;
    }
    @Override
    public void addTreeModelListener(TreeModelListener l){}
    @Override
    public void removeTreeModelListener(TreeModelListener l) {}
}
