import java.util.StringTokenizer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class JOptionPaneDemo extends JFrame implements ActionListener
{
    Container cntr=null;
    private JButton btn;
    String str;
    private JRadioButton[] r1,r2,r3;
    private int[] messageType={
            JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,
            JOptionPane.QUESTION_MESSAGE,JOptionPane.WARNING_MESSAGE,
            JOptionPane.ERROR_MESSAGE};
    private ButtonGroup bg1,bg2,bg3;
    private int[] optionType={
            JOptionPane.DEFAULT_OPTION,JOptionPane.YES_NO_OPTION,
            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.OK_CANCEL_OPTION};
    public static void main(String[]args)
    {
        new JOptionPaneDemo();
    }
    public JOptionPaneDemo()
    {
        super("JOptionPaneDemo");
        addWindowListener(new WindowListener());
        cntr=getContentPane();
        cntr.setLayout(new GridLayout(0,1));
        JPanel p=new JPanel();
        btn=new JButton("Show on Option Pane");
        btn.addActionListener(this);
        p.add(btn);
        cntr.add(p);
        createRadioButtonGrouping();
        str="Button1 Button2 Button3";
        pack();
        setVisible(true);
    }
    public void createRadioButtonGrouping()
    {
        JPanel p1=new JPanel();
        bg3=new ButtonGroup();
        r1=new JRadioButton[]{
                new JRadioButton("Show Message",true),new JRadioButton("get Conformation"),
                new JRadioButton("Collect Input"),new JRadioButton("Present Options")};
        for(int i=0;i<r1.length;i++){
            bg3.add(r1[i]);
            p1.add(r1[i]);
        }
        cntr.add(p1);
        JPanel p2=new JPanel();
        bg1=new ButtonGroup();
        r2=new JRadioButton[]{
                new JRadioButton("Plain"),new JRadioButton("Information",true),
                new JRadioButton("Question"),new JRadioButton("Warning"),new JRadioButton("Error")};
        for(int i=0;i<r2.length;i++){
            bg1.add(r2[i]);
            p2.add(r2[i]);
        }
        cntr.add(p2);
        JPanel p3=new JPanel();
        bg2=new ButtonGroup();
        r3=new JRadioButton[]{
                new JRadioButton("Default",true),new JRadioButton("Yes/NO"),
                new JRadioButton("Yes/NO/Cancel"),new JRadioButton("OK/Cancel")};
        for(int i=0;i<r3.length;i++){
            bg2.add(r3[i]);
            p3.add(r3[i]);
        }
        cntr.add(p3);
    }
    //WindowListener for WindowClosing
    public class WindowListener extends WindowAdapter
    {
        public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
    }
    public void actionPerformed(ActionEvent e1)
    {
        if(r1[0].isSelected()){
            JOptionPane.showMessageDialog(this,"Show Message","Simple Dialog",getMessageType());
        }
        else if(r1[1].isSelected()){
            JOptionPane.showConfirmDialog(this,"Get Confirmation","Simple Dialog",getButtonType(),getMessageType());
        }
        else if(r1[2].isSelected()){
            JOptionPane.showInputDialog(this,"Collect Input","Simple Dialog",getMessageType(),null,null,null);
        }
        else if(r1[3].isSelected()){
            JOptionPane.showOptionDialog(this,"Present Option","Simple Dialog",getButtonType(),getMessageType(),null,substring(str),null);
        }
    }
    private int getAssociatedType(AbstractButton[] button,int[] types)
    {
        for(int i=0;i<button.length;i++){
            if(button[i].isSelected()){
                return(types[i]);
            }
        }
        return (types[0]);
    }
    private int getMessageType()
    {
        return(getAssociatedType(r1,messageType));
    }
    private int getButtonType()
    {
        return(getAssociatedType(r3,optionType));
    }
    private String[] substring(String string)
    {
        StringTokenizer tok=new StringTokenizer(string);
        String[] substring=new String[tok.countTokens()];
        for(int i=0;i<substring.length;i++){
            substring[i]=tok.nextToken();
        }
        return(substring);
    }
}
