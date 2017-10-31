import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class addword extends JFrame
{
JLabel l1=new JLabel("enter word");
JLabel l2=new JLabel("enter meaning");
JLabel l3=new JLabel("enter example");
JTextField t1=new JTextField(30);
JTextField t2=new JTextField(30);
JTextField t3=new JTextField(30);
JButton b4=new JButton("insert");
  public addword()
  {add(l1);
   add(t1);
   add(l2);
   add(t2);
   add(l3);
   add(t3);
   add(b4);
   b4.addActionListener(new put());
   setVisible(true);
   setLayout(new FlowLayout()); 
   setSize(300,300);
  }
class put implements ActionListener
{public void actionPerformed(ActionEvent e)
{
try
{
System.out.println("test");
Class.forName("com.mysql.jdbc.Driver");

Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vineet","root","root");
System.out.println("after connection");
Statement s=c.createStatement();			
System.out.println("after statement");
String q="insert into captain(word,meaning,example)values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"')";
s.executeUpdate(q);
System.out.println("hello");



}catch(Exception e2)
{ System.out.println(e2);
}
}
}
/*public static void main(String p[])
{
addword o=new addword();

}*/
}