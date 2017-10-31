import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
class dict extends JFrame 
{
JButton b1=new JButton("ADDWORD");
JButton b2=new JButton("UPDTAE");
JButton b3=new JButton("DELETE");
JButton b4=new JButton("FETCH");

public dict()
{
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(new addition());
b2.addActionListener(new update());
b3.addActionListener(new deletion());
b4.addActionListener(new select());
setLayout(new FlowLayout());
setVisible(true);
setSize(300,300);
}
class addition implements ActionListener
{
public void actionPerformed(ActionEvent e)
  {
   new addword();
  
  }
}
class update implements ActionListener
{
public void actionPerformed(ActionEvent e)
  {
   new update_w();
  
  }
}
class deletion implements ActionListener
{
public void actionPerformed(ActionEvent e)
  {
   new delete();
  
  }
}
class select implements ActionListener
{
public void actionPerformed(ActionEvent e)
  {
  new fetch();
  
 }
}
public static void main(String p[])
{dict d=new dict();


}

}