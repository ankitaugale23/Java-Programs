import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//<applet  code="TestComponentEvent" width=400 height=400></applet>
public class TestComponentEvent extends JApplet
{
	JButton b1,b2;
	public void init()
	{
		b1=new JButton("b1");
		b2=new JButton("b2");
		Container cp=getContentPane();
		cp.add(b1);
		cp.addContainerListner(this);
		
	}public void componentAdded(ContainerEvent ce)
	{
		