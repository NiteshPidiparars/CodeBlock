import java.awt.event.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;
class ActionEventExample extends JFrame implements ActionListener
{
    private JList list;
    private DefaultListModel model;
    public ActionEventExample()
    {
        initUI();
    }
        public final void initUI()
        {
            JPanel panel=new JPanel();
            panel.setLayout(null);
            model=new DefaultListModel();
            list=new JList(model);
            list.setBounds(150,30,220,150);
            JButton okButton=new JButton("OK");
            okButton.setBounds(30,35,80,25);
            okButton.addActionListener(this);
            panel.add(okButton);
            panel.add(list);
            add(panel);
            setTitle("Event Example");
            setSize(420,250);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent e)
        {
            Locale locale=Locale.getDefault();
            Date date=new Date(e.getWhen());
            String s=DateFormat.getTimeInstance(DateFormat.SHORT,locale).format(date);
            if(!model.isEmpty()){
                model.clear();
            }
            if(e.getID()==ActionEvent.ACTION_PERFORMED){
                model.addElement("Event id: ACTION_PERFORMED");
            }
            model.addElement("Time: "+s);
            String source=e.getSource().getClass().getName();
            model.addElement("Source: "+source);
            int mod=e.getModifiers();
            StringBuffer bf=new StringBuffer("Modifiers");
            if((mod & ActionEvent.ALT_MASK)>0)
            {
                bf.append("Alt");
            }
            if((mod & ActionEvent.SHIFT_MASK)>0)
            {
                bf.append("Shift");
            }
            if((mod & ActionEvent.META_MASK)>0)
            {
                bf.append("Meta");
            }
            if((mod & ActionEvent.CTRL_MASK)>0)
            {
                bf.append("ctrl");
            }
            model.addElement(bf);
        }
        public static void main(String[]args)
        {
            SwingUtilities.invokeLater(new Runnable()
                                       {
                                           public void run()
                                       {
                                           ActionEventExample ex=new ActionEventExample();
                                           ex.setVisible(true);
                                       }
                                       });
    }
}







