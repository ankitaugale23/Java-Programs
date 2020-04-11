import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="TestKeyEvents" width=400 height=400></applet>
public class TestKeyEvents extends Applet implements KeyListener
{
	String msg="";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		msg="Key is Pressed";
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		msg="Key is released";
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
		msg="Key is Entered";
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
}
