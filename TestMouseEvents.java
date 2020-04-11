import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="TestMouseEvents" width=400 height=400></applet>
public class TestMouseEvents extends Applet implements MouseListener,MouseMotionListener,MouseWheelListener
{
	String msg="";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		msg="Mouse Clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		msg="Mouse Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		msg="Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		msg="Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		msg="Mouse Released";
		repaint(); 
	}
	public void mouseDragged(MouseEvent me)
	{
		msg="Mouse Dragged";
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		msg="Mouse moved";
		repaint();
	}
	public void mouseWheelMoved(MouseWheelEvent me)
	{
		msg="dont touch that wheel!!!!";
		repaint();
	}
	public void paint (Graphics g)
	{
		g.drawString(msg,20,40);
	}
}