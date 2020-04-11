import java.awt.*;
import java.awt.event.*;
public class TestDialog3 extends Frame implements ActionListener
{
	public TestDialog3()
	{
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		Button b1=new Button("click");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae);
	{
		new MyDialog(this,"hii");
	}
    public static void main(String args[])
	{
		new  TestDialog3();
	}
}
class MyDialog extends Dialog
{
	public MyDialog(Frame f,String title)
	{
		TestDialog3 t=new TestDialog3();
		super(f,title);
		setVisible(true);
		setSize(400,400);
	}
	
}
		