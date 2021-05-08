import java.awt.*;
import java.awt.event.*;
public class PopupMenuExample
{
    public static void main(String[]args)
    {
        final Frame f=new Frame(" PopupMenuExample ");
        final PopupMenu popupmenu=new PopupMenu("Edit");
        f.setVisible(true);
        f.setLayout(null);
        f.setBounds(200,100,450,400);
        f.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                            {
                                System.exit(0);
                            }
                            });
                            MenuItem cut=new MenuItem("Cut");
                            cut.setActionCommand("Cut");
                            MenuItem copy=new MenuItem("Copy");
                            copy.setActionCommand("Copy");
                            MenuItem past=new MenuItem("Past");
                            past.setActionCommand("Past");
                            MenuItem move=new MenuItem("Move");
                            move.setActionCommand("Move");
                            MenuItem rename=new MenuItem("Rename");
                            rename.setActionCommand("Rename");
                            popupmenu.add(cut);
                            popupmenu.add(copy);
                            popupmenu.add(past);
                            popupmenu.add(move);
                            popupmenu.add(rename);
                            f.addMouseListener(new MouseAdapter()
                                            {
                                                public void mouseClicked(MouseEvent e)
                                            {
                                                popupmenu.show(f,e.getX(),e.getY());
                                            }
                                            });
                                            f.add(popupmenu);
    }
}
