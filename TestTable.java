import javax.swing.*;
public class TestTable extends JFrame
{
	JTable table;
	public TestTable()
	{
		super("Table");
		setVisible(true);
		setSize(400,400);
		final String[] colHeads = {"ID","Name"};
		final Object[][] data={ { "1","ankita" } , { "2","tushar"} };
		table=new JTable(data,colHeads);
		add(table);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(table,v,h);
		add(jsp);
	}
	public static void main(String args[])
	{
		new TestTable();
	}
}