// PROGRAM:63 ADVANCED TOPIC:20 JList PART:01 how to create static(Fixed) list
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI63 extends JFrame
{
	JLabel label1=new JLabel("Nothing Clicked");
	String items[]={"Item1","Item2","Item3","Item4","Item5","Item6","Item7","Item8","Item9","Item10"};
	public GUI63()
	{
		setTitle("GUI63 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		JList list=new JList(items);
		list.setVisibleRowCount(5);

		JPanel panel=new JPanel();
		panel.add(new JScrollPane(list));
		add(panel);
		panel.add(label1);

		revalidate();

		list.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
				{
					int index=list.getSelectedIndex();
					String item=(String)list.getSelectedValue();

					label1.setText("Select item "+item+" and Selected index "+index);
				}
			}
		});		
	}

	public static void main(String[] args) {
		new GUI63();
	}
}