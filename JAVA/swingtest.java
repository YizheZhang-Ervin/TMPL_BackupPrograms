import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swingtest implements ActionListener{
public static JButton jb1;
public static JButton jb2;
public static JFrame jf;
public static JPanel jp1;
public static JPanel jp2;
public static JSplitPane jsp;
public static TextArea area;

public static void main(String[] args){
jf=new JFrame("big title");
jp1=new JPanel();
jp2=new JPanel();
jb1=new JButton();
jb2=new JButton();
jsp=new JSplitPane();
area =new TextArea(10,20);

jb1.setPreferredSize(new Dimension(30,30));
jb2.setPreferredSize(new Dimension(30,30));


jf.setBounds(300,100,200,400);
jf.add(jp1);
jf.add(jp2);
jf.add(jsp);
jp2.add(area);
jsp.setLeftComponent(jp1);
jsp.setRightComponent(jp2);

jp1.setLayout(new BorderLayout());
jp1.add(jb1,BorderLayout.NORTH);
jp1.add(jb2,BorderLayout.SOUTH);

jf.setVisible(true);

new swingtest().show();
}

public void show(){
jb1.addActionListener(this);
jb2.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
area.append("haha ");
}
}