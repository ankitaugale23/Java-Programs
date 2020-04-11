import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="TestMouseAdapter" width=400 height=400></applet>
public class TestMouseAdapter extends Applet
{
	public void init()
	{
		addMouseListener(new MyAdapter(this));
	}
}

class MyAdapter extends MouseAdapter
{
	TestMouseAdapter t;
	public MyAdapter(TestMouseAdapter t)
	{
		this.t=t;
	}
	public void mouseEntered(MouseEvent me)
	{
		t.showStatus("Mouse Entered");
	}
	public void mouseExited(MouseEvent me)
	{
		t.showStatus("mouse Exited");
	}
}
		