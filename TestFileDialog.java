import java.awt.*;
import java.awt.event.*;
public class TestFileDialog extends Frame implements ActionListener
{
	public TestFileDialog()
	{
		setVisible(true);
		setSize(400,400);
		Button b1=new Button("Click");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		MyDialog d=new MyDialog(this,"hii");
		d.setVisible(true);
		d.setSize(400,400);
	}
	public static void main(String args[])
	{
		new TestFileDialog();
	}
}
class MyDialog extends FileDialog
{
	public MyDialog(Frame f,String title)
	{
		super(f,title,FileDialog.SAVE);
		
		/*TestFileDialog t=new TestFileDialog();
		FileDialog f=new FileDialog(t,"hii",FileDialog.SAVE);
		f.setVisible(true);*/
	}
}
		