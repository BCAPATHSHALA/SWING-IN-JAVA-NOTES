// PROGRAM:49 ADVANCED TOPIC:07 JSeparator is used to draw a line bw two components
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;

public class GUI49 extends JFrame
{
	public GUI49()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI49 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		// program:01
		JPanel panel=new JPanel();
		// panel.setLayout(new GridLayout(0,1)); // Multiple rows and 1 column
		panel.setLayout(new GridLayout(1,0)); // Multiple columns and 1 row
		panel.add(new JLabel("First label"));
		// panel.add(new JSeparator(SwingConstants.HORIZONTAL));
		panel.add(new JSeparator(SwingConstants.VERTICAL));
		panel.add(new JLabel("Second label"));
		add(panel);
		// program:02
		JMenuBar menubar=new JMenuBar();
		add(menubar,BorderLayout.PAGE_START);

		JMenu file=new JMenu("File");
		menubar.add(file);

		JMenuItem m1=new JMenuItem("First");
		JMenuItem m2=new JMenuItem("Second");
		JMenuItem m3=new JMenuItem("Third");
		JMenuItem m4=new JMenuItem("Fourth");
		JMenuItem m5=new JMenuItem("Fifth");
		file.add(m1);
		file.add(new JSeparator(SwingConstants.HORIZONTAL));
		file.add(m2);
		file.add(m3);
		file.addSeparator(); // same as JSeparator  
		file.add(m4);
		file.add(m5);


		setVisible(true);
		validate();
	}
 
	public static void main(String[] args) 
	{
		GUI49 jf=new GUI49();
	}
}



