import java.awt.*;
import javax.swing.*;
public class TestSwingControls extends JFrame
{
	JLabel lname,lpass;
	JTextField tname,tpass;
	JButton blogin;
	public TestSwingControls()
	{
		super("frame123");
		setSize(400,400);
		setVisible(true);
		//setLayout(new GridLayout(10,2,2,5));
		setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		
		lname=new JLabel("Username");
		lpass=new JLabel("Password");
		tname=new JTextField(10);
		tpass=new JTextField(10);
		blogin=new JButton("Login");
		add(lname);
		add(tname);
		add(lpass);
		add(tpass);
		add(blogin);
	}
	public static void main(String args[])
	{
		new TestSwingControls();
	}
}