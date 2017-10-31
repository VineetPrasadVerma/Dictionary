import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class delete extends JFrame
{
JLabel l5=new JLabel("WORD WNT TO DEL");
JTextField t5=new JTextField(30);
JButton b5=new JButton("DELETE WORD");
public delete()
{add(l5);
add(t5);
add(b5);
b5.addActionListener(new remove());
setSize(300,300);
setLayout(new FlowLayout());
setVisible(true);

}
class remove implements ActionListener
{public void actionPerformed(ActionEvent e)
{
try

{Class.forName("com.mysql.jdbc.Driver");

Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vineet","root","root");
System.out.println("after connection");
Statement s=c.createStatement();			
System.out.println("after statement");			
String q="delete from captain where word=('"+t5.getText()+"')";
s.executeUpdate(q);
System.out.println("hello");
c.close();
}
catch(Exception ee)
{System.out.println(ee);
}		    
}
}

                
public static void main(String p[])
{delete y=new delete();

}

}
