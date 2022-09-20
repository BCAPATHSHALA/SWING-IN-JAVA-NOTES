// PROGRAM:42 ADVANCED TOPIC:02 JScrollPane
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI42
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI42 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		// Container c=jf.getContentPane();
		// c.setLayout(new FlowLayout());
		jf.setLayout(new FlowLayout());

		JTextArea textArea=new JTextArea(10,30);
		textArea.setLineWrap(true);

		JScrollPane sp=new JScrollPane
		(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jf.add(sp);
 
		jf.setVisible(true);
	}
}

 