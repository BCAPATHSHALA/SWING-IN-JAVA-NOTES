// PROGRAM:71 ADVANCED TOPIC:27 JTree Graphics:02
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class GUI71
{
	public static void main(String[] args) 
	{
		JFrame frame=new JFrame("GUI71 PROGRAM");
		frame.setSize(600,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		// make the rootNode and child node like A,B, A1,B1 etc
		DefaultMutableTreeNode rootNode=new DefaultMutableTreeNode("TOP");

		DefaultMutableTreeNode A=new DefaultMutableTreeNode("A");
		DefaultMutableTreeNode B=new DefaultMutableTreeNode("B");

		DefaultMutableTreeNode A1=new DefaultMutableTreeNode("A1");
		DefaultMutableTreeNode A2=new DefaultMutableTreeNode("A2");

		DefaultMutableTreeNode B1=new DefaultMutableTreeNode("B1");
		DefaultMutableTreeNode B2=new DefaultMutableTreeNode("B2");
		DefaultMutableTreeNode B3=new DefaultMutableTreeNode("B3");

		A.add(A1);
		A.add(A2);

		B.add(B1);
		B.add(B2);
		B.add(B3);

		rootNode.add(A);
		rootNode.add(B);

		JTree tree=new JTree(rootNode);
		frame.add(tree);

		frame.setVisible(true);
		frame.revalidate();

	} 
}

/*

1. A JTree is a swing component that is used to display a
hierarchical data into a tree form. 
2. A tree is made of nodes. The node from which tree starts is called root node. 
3. The node having sub-nodes is called parent. 
4. The node having its parent is called child node. 
5. The node having no child is called leaf-node. 
6. The nodes at the same hierarchical level and having same parent is called siblings.

*/