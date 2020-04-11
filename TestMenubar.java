import java.awt.*;
public class TestMenubar extends Frame
{
	MenuBar menu;
	Menu m1,m2,m3;
	MenuItem m11,m12,m21,m22,m31,m32;
	CheckboxMenuItem debug;
	public TestMenubar()
	{
		super("frame menu");
		setVisible(true);
		setSize(400,400);
		menu=new MenuBar();
		setMenuBar(menu);
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("View");
		
		m11=new MenuItem("File1");
		m12=new MenuItem("File2");
		m21=new MenuItem("Edit1");
		m22=new MenuItem("Edit2");
		m31=new MenuItem("View1");
		m32=new MenuItem("View2");
		debug=new CheckboxMenuItem("Debug");
		debug.setState(true);
		
		m1.add(m11);
		m1.add(m12);
		m2.add(m21);
		m2.add(m22);
		m3.add(m31);
		m3.add(m32);
		m3.add(debug);
		
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
	}
	public static void main(String args[])
	{
		new TestMenubar();
	}
}