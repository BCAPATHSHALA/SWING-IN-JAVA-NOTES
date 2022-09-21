// PROGRAM:2 ADVANCED TOPIC:01 JTable PART:01
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class GUI2
{
	public static void main(String[] args) 
	{
		
		MyTable obj=new MyTable();	
	}	
}

class MyTable extends JFrame
{
	JTable table;
	public MyTable()
	{
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI2 Table");
		setVisible(true);	

		Object [][] rowData={{001,"MANOJ NISHAD",24},
						{002,"AMIT TIWARI",20},
						{003,"RAJAT THAKUR",21}};

		String [] columNames={"ROLL NO", "NAME", "AGE"};

		DefaultTableModel model=new DefaultTableModel(rowData,columNames);
		table=new JTable(model);
		add(new JScrollPane(table));
		
		validate();// to refrece the window
	}
}

 