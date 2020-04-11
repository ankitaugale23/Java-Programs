import java.awt.*;
import javax.swing.*;
//<applet code="TestJAppletControls" width=400 height=400></applet>
public class TestJAppletControls extends JApplet
{
	JLabel lname,laddr,lgender,ldiv;
	JButton blogin;
	JTextField tname;
	JTextArea taddr;
	JRadioButton rmale,rfemale;
	JComboBox JCdiv;
	JCheckBox c1,c2,c3;
	public void init()
	{	
		Container cp=getContentPane();
		lname=new JLabel("Name");
		laddr=new JLabel("Address");
		lgender=new JLabel("Gender");
		ldiv=new JLabel("Division");
		blogin=new JButton("Login");
		tname=new JTextField(10);
		taddr=new JTextArea(10,10);
		rmale=new JRadioButton("Male");
		rfemale=new JRadioButton("Female");
		JCdiv=new JComboBox();
		c1=new JCheckBox("c1");
		c2=new JCheckBox("c2");
		c3=new JCheckBox("c3",true);
		JCdiv.addItem("A1");
		JCdiv.addItem("A2");
		JCdiv.addItem("A3");
		cp.setLayout(new GridLayout(10,2,2,5));
		cp.add(lname);
		cp.add(tname);
		cp.add(laddr);
		cp.add(taddr);
		cp.add(lgender);
		cp.add(rmale);
		cp.add(rfemale);
		cp.add(JCdiv);
		cp.add(c1);
		cp.add(c2);
		cp.add(c3);
		cp.add(blogin);
	}
}
		
		
