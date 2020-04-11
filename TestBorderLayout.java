import javax.swing.*;
import java.awt.*;
public class TestBorderLayout 
{
	Frame frm;
	Label l1,l2,l3,l4,l5;
	public TestBorderLayout()
	{
		frm=new Frame("frame border");
		frm.setVisible(true);
		frm.setSize(400,400);
		frm.setLayout(new BorderLayout());
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		Panel p5=new Panel();
		l1=new Label("Label1");
		l2=new Label("Label2");
		l3=new Label("Label3");
		l4=new Label("Label4");
		l5=new Label("Label5");
		p1.add(l1);
		p2.add(l2);
		p3.add(l3);
		p4.add(l4);
		p5.add(l5);
		frm.add(p1,BorderLayout.CENTER);
		frm.add(p2,BorderLayout.EAST);
		frm.add(p3,BorderLayout.NORTH);
		frm.add(p4,BorderLayout.WEST);
		frm.add(p5,BorderLayout.SOUTH);
	
	}
	public static void main(String args[])
	{
		 new TestBorderLayout();
	}
}