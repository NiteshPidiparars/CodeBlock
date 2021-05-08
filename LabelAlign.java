import java.util.*;
class LabelAlign extends JFrame
{
    public static void main(String[]args)
    {
        JFrame f=new JFrame("My Label");
        f.setVisible(true);
        f.setBounds(200,100,50,60);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Label lb1=new Label("left Label");
        Label lb2=new Label("Right Label");
        Label lb3=new Label("center Label");
        Label lb4=new Label("set center Alignment");
        f.add(lb1);
        f.add(lb2);
        f.add(lb3);
        f.add(lb4);
        f.setTitle("Label Alignment");
    }
}
