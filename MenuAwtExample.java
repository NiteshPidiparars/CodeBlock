import java.awt.*;
import java.awt.event.*;
class MenuAwtExample
{
    public static void main(String[]args)
    {
        Frame f=new Frame("Menu and SubMenu Frame");
        f.setBounds(250,180,450,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
                           {
                               public void windowClosing(WindowEvent e)
                           {
                               System.exit(0);
                           }
                           });
                           MenuBar mb=new MenuBar();
                           Menu menu=new Menu("Menu");
                           Menu submenu=new Menu("Sub Menu");
                           MenuItem i1=new MenuItem("Item 1");
                           MenuItem i2=new MenuItem("Item 2");
                           MenuItem i3=new MenuItem("Item 3");
                           MenuItem i4=new MenuItem("Item 4");
                           MenuItem i5=new MenuItem("Item 5");
                           menu.add(i1);
                           menu.add(i2);
                           menu.add(i3);
                           submenu.add(i4);
                           submenu.add(i5);
                           menu.add(submenu);
                           mb.add(menu);
                           f.setMenuBar(mb);
    }
}
