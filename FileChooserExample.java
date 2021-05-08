import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class FileChooserExample extends JFrame implements ActionListener
{
    JMenuItem open; JMenu file; JMenuBar mb; JTextArea ta;
    FileChooserExample()
    {
        JFrame f=new JFrame("FileChooserExample");
        f.setBounds(250,150,700,700);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        open=new JMenuItem("Open File");
        open.addActionListener(this);
        file=new JMenu("File");
        file.add(open);
        mb=new JMenuBar();
        mb.setBounds(0,0,700,20);
        mb.add(file);
        ta=new JTextArea(600,500);
        ta.setBounds(0,20,500,500);
        f.add(mb);
        f.add(ta);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==open){
            JFileChooser fc=new JFileChooser();
            int i=fc.showOpenDialog(this);
            if(i==JFileChooser.APPROVE_OPTION){
                File f=fc.getSelectedFile();
                String filepath=f.getPath();
                try
                {
                    BufferedReader bf=new BufferedReader(new FileReader(filepath));
                    String s1="",s2="";
                    while((s1=bf.readLine())!=null){
                        s2+=s1+"\n";
                    }
                        ta.setText(s2);
                        bf.close();
                    }catch(Exception ex)
                    {
                        ex.printStackTrace();
                    }
                }
            }
        }
    public static void main(String[]args)
    {
        new FileChooserExample();
    }
}
