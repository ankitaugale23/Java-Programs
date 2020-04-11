import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="TestCardLayout" width=400 height=400></applet>
public class TestCardLayout extends Applet implements ActionListener
{
	
	Panel oscards;
	Label l1,l2,l3,l4;
	Button b1;
	CardLayout cardlo;
	public void init()
	{
		cardlo=new CardLayout();
		oscards=new Panel();
		oscards.setLayout(cardlo);
		Panel p1=new Panel();
		Panel p2=new Panel();
		l1=new Label("panel1");
		l2=new Label("Panel1");
		l3=new Label("Panel2");
		l4=new Label("Panel2");
		b1=new Button("b1");
		p1.add(l1);
		p1.add(l2);
		p2.add(l3);
		p2.add(l4);
		oscards.add(p1,"Panel11");
		oscards.add(p2,"Panel22");
		add(oscards);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			cardlo.show(oscards,"Panel22");
		}
		
		
		
	}
	
	
			
}