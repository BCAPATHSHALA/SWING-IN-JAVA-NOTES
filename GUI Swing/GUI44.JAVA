// PROGRAM:44 ADVANCED TOPIC:04 JTable PART:01
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI44
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI44 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		// Container c=jf.getContentPane();
		// c.setLayout(null);

		String [][] data={{"001","MANOJ NISHAD","24"},
						{"002","AMIT TIWARI","20"},
						{"003","RAJAT THAKUR","21"}};

		String [] columName={"ROLL NO", "NAME", "AGE"};

		JTable table=new JTable(data,columName);
		jf.add(new JScrollPane(table)); 
 
		jf.setVisible(true);
	}
}

 