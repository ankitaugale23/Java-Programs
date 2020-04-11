import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="TestEvents" width=400 height=400></applet>
public class TestEvents extends Applet implements ItemListener
{
	Checkbox cg,ch;
	CheckboxGroup cbg;
	String msg="";
	public void init()
	{
		cbg=new CheckboxGroup();
		cg=new Checkbox("maths",cbg,true);
		ch=new Checkbox("Science",cbg,false);
		add(cg);
		add(ch);
		cg.addItemListener(this);
		ch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		msg=""+cbg.getSelectedCheckbox().getLabel();
		/*if(ie.getSource()==cg)
		{
			msg=""+cg.getState();
		}*/
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,40);
	}
}
		