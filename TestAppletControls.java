import java.awt.*;
import java.applet.*;
//<applet code="TestAppletControls"  width=400 height=400></applet>

public class TestAppletControls extends Applet
{
	Label lname,lno,lsub,ldiv,lgender,laddr;
	Button blogin;
	TextField tname,tno,tdiv,tsub;
	Choice cDiv;
	List lSub;
	Checkbox cMale,cFemale;
	CheckboxGroup cGender;
	TextArea taddr;
	Scrollbar sb;
	public void init()
	{
		int height=Integer.parseInt(getParameter("height"));
		int width=Integer.parseInt(getParameter("width"));
		lname=new Label("Name");
		lno=new Label("Mobile no");
		lsub=new Label("Subjects");
		ldiv=new Label("Divison");
		lgender=new Label("Gender");
		laddr=new Label("Address");
		tname=new TextField(10);
		tno=new TextField(10);
		tsub=new TextField(10);
		tdiv=new TextField(10);
		taddr=new TextArea(20,20);
		cDiv=new Choice();
		lSub=new List(4,true);
		blogin=new Button("Login");
		cGender=new CheckboxGroup();
		cMale=new Checkbox("Male",cGender,false);
		cFemale=new Checkbox("Female",cGender,false);
		sb=new Scrollbar(Scrollbar.VERTICAL,0,5,0,height);
		
		cDiv.add("A2");
		cDiv.add("A1");
		cDiv.add("A3");
		
		lSub.add("maths");
		lSub.add("science");
		lSub.add("marathi");
		lSub.add("english");
		
		//add the controls....
		add(lname);
		add(tname);
		add(lno);
		add(tno);
		add(lsub);
		add(lSub);
		add(ldiv);
		add(cDiv);
		add(lgender);
		add(cMale);
		add(cFemale);
		add(laddr);
		add(taddr);
		add(blogin);
		add(sb);
	}
}
		
		