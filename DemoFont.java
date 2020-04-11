import java.awt.*;
import java.applet.*;
//<applet code="DemoFont" width=400 height=400></applet>
public class DemoFont extends Applet
{
	public void paint(Graphics g)
	{
		String str="hello world";
		Font f=new Font("Arial",Font.BOLD,20);
		g.setFont(f);
		FontMetrics met=g.getFontMetrics(f);
		int ascent=met.getAscent();
		int height=met.getHeight();
		int leading=met.getLeading();
		int baseline=leading+ascent;
		for(int i=0;i<10;i++)
		{
			g.drawString("line"+String.valueOf(i),10,baseline);
			baseline+=height;
		}
	}
}