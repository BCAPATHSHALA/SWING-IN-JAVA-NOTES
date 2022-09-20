// PROGRAM:45 ADVANCED TOPIC:04 JTable PART:01 
// Create a table using DefaultTableModel using constructor JTable(tableModel)
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.Object;

public class GUI45
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI45 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		Container c=jf.getContentPane();

		Object [][] rowData={{001,"MANOJ NISHAD",24},
						{002,"AMIT TIWARI",20},
						{003,"RAJAT THAKUR",21}};

		String [] columName={"ROLL NO", "NAME", "AGE"};

		DefaultTableModel tableModel=new DefaultTableModel(rowData,columName);

		JTable table=new JTable(tableModel);
		c.add(new JScrollPane(table));

 
		jf.setVisible(true);
	}
}

 