// PROGRAM:1 ADVANCED TOPIC:01 JTable PART:00
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI1
{
	public static void main(String[] args) {
		

		String [][] data={{"001","MANOJ NISHAD","24"},
						{"002","AMIT TIWARI","20"},
						{"003","RAJAT THAKUR","21"}};

		String [] columName={"ROLL NO", "NAME", "AGE"};


		JTable table=new JTable(data,columName);
		JScrollPane sp=new JScrollPane(table);
		JFrame jf=new JFrame("GUI1 Table Demo");
		jf.add(sp);


		
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);	
	}
}

 