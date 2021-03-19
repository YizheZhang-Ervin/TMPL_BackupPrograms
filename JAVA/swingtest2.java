import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swingtest2 {
  private JFrame jf;
  private JPanel jp;
  private JButton jb1;
  private JButton jb2;

  public swingtest2(){
    jf=new JFrame("This is Jframe");
    jp=new JPanel();
    jb1=new JButton("B1");
    jb2=new JButton("B2");
  }

  private void init(){
    jf.add(jp);
    jp.add(jb1,BorderLayout.NORTH);
    jp.add(jb2,BorderLayout.CENTER);
  }
  
  public void show(){
    init();
    jf.pack();
    jf.setVisible(true);
    jb1.addActionListener(new ButtonActionHandler());
    jb2.addActionListener(new ButtonActionHandler());
  }
  
  private class ButtonActionHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
      System.out.print("haha");
   }
 }
  public static void main(String[] args){
    new swingtest2().show();
  }


}