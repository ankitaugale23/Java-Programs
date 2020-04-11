import java.awt.*;
import java.beans.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.Serializable;
public class LabelProp extends JPanel implements java.io.Serializable
{
	
		String caption="send";
	public LabelProp()
	{
		JLabel l1=new JLabel("send");
		add(l1)
	}
	public String getLabel()
	{
		return l1;
	}
	public void setLabel(String s)
	{
		caption=s;
		la.setText(caption);
	
	}
}