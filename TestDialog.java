import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//<applet code="TestDialog" width=400 height=400></applet>
public class TestDialog extends JApplet implements ActionListener
{
	JPanel p1;
	JButton b1;
	public void init()
	{
		p1=new JPanel();
		b1=new JButton("button1");
		p1.add(b1);
		getContentPane().add(p1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int result;
			result=JOptionPane.showConfirmDialog(this,"Continue??");
			System.out.println(result);
			switch(result)
			{
				case JOptionPane.YES_OPTION:
				showStatus("yes button was pressed");
				break;
				
				case JOptionPane.NO_OPTION:
				showStatus("No button was pressed");
				break;
				
				case JOptionPane.CANCEL_OPTION:
				showStatus("Cancel button was pressed");
				break;
			}
		}
	}
}
				