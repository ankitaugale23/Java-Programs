import javax.swing.*;
import java.awt.*;
public class TestTabbedpane extends JFrame
{
	public TestTabbedpane()
	{
		super("Tabbed pane");
		setVisible(true);
		setSize(400,400);
		JTabbedPane jtb=new JTabbedPane();
		Panel p1=new Panel();
		Panel p2=new Panel();
		JButton b1=new JButton("Panel1button");
		JButton b2=new JButton("Panel2button");
		p1.add(b1);
		p2.add(b2);
		jtb.addTab("comp1",p1);
		jtb.addTab("comp2",p2);
		add(jtb);
	}
	public static void main(String args[])
	{
		 new TestTabbedpane();
	}
}
		 