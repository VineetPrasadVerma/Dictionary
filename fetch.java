import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class fetch extends JFrame
{
int k=0;
JLabel l1=new JLabel("WORD");
JTextField t1 =new JTextField(30);
JButton b1=new JButton("search");
public fetch()
{add(l1);
add(t1);
add(b1);
b1.addActionListener(new search());
setLayout(new FlowLayout());
setVisible(true);
setSize(300,300);			
}
class search implements ActionListener
{public void actionPerformed(ActionEvent e)
{try
{
System.out.println("test");
Class.forName("com.mysql.jdbc.Driver");

Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/vineet","root","root");
//System.out.println("after connection");
Statement s=c.createStatement();			
//System.out.println("after statement");
String q="select word, meaning from captain where word=('"+t1.getText()+"') ";
//s.executeQuery(q);
ResultSet r=s.executeQuery(q);
while(r.next())
{
String word = r.getString(1);
String meaning = r.getString(2);
//String meaning = r.getString(2);
//String example = r.getString(3);

System.out.print(word + ": " );
System.out.print(meaning + ": ");
//System.out.print(example);
System.out.println();

k++;
} if(k==0)
System.out.println("result not found");
}
catch(Exception ee)
{System.out.print(ee);

}


}
}

}