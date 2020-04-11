import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class EventListenerPractice extends Frame
{
	Label l,label;
	Button b;
	Frame f;
	String msg;
	int x,y;
	public EventListenerPractice()
	{
		setTitle("Frame");
		setSize(400,400);
		setVisible(true);
		
		f = this;
		
		msg = "";
		x = 0 ;
		y = 0;
		l = new Label("hello every one");
		label = new Label();
		b = new Button("Next");
		
		label.setBounds(50,50,200,30);
		l.setBounds(50,80,100,30);
		b.setBounds(50,110,100,30);
		
		addFocusListener(new FocusAdapter(){
			public void focusGained(FocusEvent fe)
			{
				System.out.println("Focus Gained");
			}
			public void focusLost(FocusEvent fe)
			{
					System.out.println("Focus Lost");
			}
		});
		
		addComponentListener(new ComponentAdapter(){
			public void componentMoved(ComponentEvent ce)
			{
				System.out.println("Component moved");
				new DialogClass(f,"Component moved");
			}
			public void componentResized(ComponentEvent ce)
			{
				System.out.println("The component was resized...");
				new DialogClass(f,"ComponentResized");
			}
			public void componentShown(ComponentEvent ce)
			{
				System.out.println("The component was shown...");
				new DialogClass(f,"Component Shown");
			}
		});
		
		addContainerListener(new ContainerAdapter(){
			public void componentAdded(ContainerEvent ce)
			{
				System.out.println("Component add: "+ce.getChild().toString());
				new DialogClass(f,"Component Added");
			}
		});
		
		add(l);
		add(b);
		add(label);
		
		addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent me)
			{
				System.out.println("mouse entered");
				label.setText("Mouse at: ("+me.getX()+","+me.getY()+")");
			}
			public void mouseExited(MouseEvent me)
			{
				label.setText("");
			}
		});
		
		addMouseMotionListener(new Mymouseadapter());
	}
	
	class Mymouseadapter implements MouseMotionListener
 	{
		Mymouseadapter()
		{}
		public void mouseMoved(MouseEvent me)
		{
			label.setText("Mouse dragged at: "+me.getX()+me.getY());
		}
		public void mouseDragged(MouseEvent me)
		{}
	}
	
	public static void main(String args[])
	{
		new EventListenerPractice();
	}
}

class DialogClass extends Dialog
{
	DialogClass(Frame f,String msg)
	{
		super(f,"Alert",false);
		setSize(200,200);
		setVisible(true);
		setFont(new Font("Comic Sans Ms",Font.BOLD + Font.ITALIC,20));
		add(new Label(msg));
	}
}