import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
public class TestTree extends JFrame
{
	JTree tree;
	DefaultMutableTreeNode root; 
	public TestTree()
	{
		super("frametree");
		setVisible(true);
		setSize(400,400);
		root=new DefaultMutableTreeNode("Divisions");
		DefaultMutableTreeNode a=new DefaultMutableTreeNode("A");
		DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
		DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
		a.add(a1);
		a.add(a2);
		root.add(a);
		DefaultMutableTreeNode b=new DefaultMutableTreeNode("B");
		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
		
		b.add(b1);
		b.add(b2);
		root.add(b);
		tree=new JTree(root);
		add(tree);
	}
	public static void main(String args[])
	{
		 new TestTree();
	}
}