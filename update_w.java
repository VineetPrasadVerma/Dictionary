import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class update_w extends JFrame
{JLabel l6=new JLabel("enter word");
JLabel l7=new JLabel("enter old meaning");
JLabel l8=new JLabel("enter new meaning");
JTextField t6=new JTextField(30);
JTextField t7=new JTextField(30);
JTextField t8=new JTextField(30);
JButton b7=new JButton("update word");
public update_w()
{
add(l6);
add(t6);
add(l7);
add(t7);
add(l8);
add(t8);
add(b7);
setVisible(true);
setLayout(new FlowLayout());
setSize(300,300);
b7.addActionListener(new up());

}
class up implements ActionListener
{public void actionPerformed(ActionEvent e)
{try
{Class.forName("com.mysql.jdbc.Driver");

Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vineet","root","root");
System.out.println("after connection");
Statement s=c.createStatement();			
System.out.println("after statement");			
String q="update captain set meaning=('"+t8.getText()+"') where meaning=('"+t7.getText()+"')";
s.executeUpdate(q);
System.out.println("hello");
c.close();
}
catch(Exception ee)
{
System.out.println(ee);
}
                
}

}
public static void main(String p[])
{update_w d=new update_w();
}


} 






























