import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.sql.*;
public class TestLoginJDBC extends JFrame implements ActionListener
{
	JLabel lname,lpass,lregister,llogin;
	JTextField tname,tpass,tdone;
	JButton blogin,bregister;
	public TestLoginJDBC() 
	{

		super("frame123");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
			
		lname=new JLabel("Username");
		lpass=new JLabel("Password");
		lregister=new JLabel("Registerd successfully");
		llogin=new JLabel("Invalid User");
		tname=new JTextField(10);
		tpass=new JTextField(10);
		tdone=new JTextField(10);
		blogin=new JButton("Login");
		bregister=new JButton("Register");
		add(lname);
		add(tname);
		add(lpass);
		add(tpass);
		add(blogin);
		add(bregister);
		//add(tdone);
		
		blogin.addActionListener(this);
		bregister.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
		
		if(ae.getSource()==bregister)
		{
			
			registerData();
			
		}
		if(ae.getSource()==blogin)
		{
			loginData();
		}
		
		}
		catch(Exception e)
			{}
	}
		
	public static void main(String args[])
	{
		new TestLoginJDBC();
	}
	public void registerData() throws Exception
	{
		try
	    {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ankita");
		PreparedStatement ps=con.prepareStatement("insert into student121 values(?,?)");
		ps.setString(1,tname.getText());
		ps.setString(2,tpass.getText());
		int i=ps.executeUpdate();
		if(i>0)
		{
			Dialog d=new Dialog(TestLoginJDBC.this,"Registration",false);
			d.setVisible(true);
			d.setSize(400,200);
			d.add(lregister);
		}
	 }
	 catch(SQLException se)
	{
		System.out.println(se);
	}
	}
	public void loginData() throws Exception
	{	
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ankita");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student121");
		String name;
		String pass;
		while(rs.next())
		{
			name=rs.getString(1);
			pass=rs.getString(2);
			if(tname.getText().equals(name) && tpass.getText().equals(pass))
			{
				MyFrame f=new MyFrame();
				f.setVisible(true);
				f.setSize(400,400);
			}
			else
				
				{
					Dialog d=new Dialog(TestLoginJDBC.this,"Registration",false);
					d.setVisible(true);
					d.setSize(400,200);
					d.add(llogin);
				}
		}
	
			
				
			
	}	
}
class MyFrame extends JFrame
{
	public MyFrame()
	{
		
		JLabel l1=new JLabel("Welecome user");
	}
} 