// PROGRAM:59 ADVANCED TOPIC:16 How to call a JFrame from another JFrame 
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI59 //Caller Class
{
	public static void main(String[] args) {
		new XClass();
	}
}

class XClass implements ActionListener
{
	JFrame frame1,frame2;
	JTextField t1;
	JLabel label1;

	public XClass()
	{
		frame1 = new JFrame();
		frame1.setTitle("GUI59 PROGRAM");
		frame1.setSize(650,400);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);
		frame1.setLayout(new FlowLayout());
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button1=new JButton("Click");
		frame1.add(button1);
		button1.addActionListener(this);

		label1=new JLabel("Open New JFrame");
		frame1.add(label1);

		frame1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Click"))
		{
			frame2 = new JFrame();
			frame2.setTitle("Another frame2");
			frame2.setSize(650,400);
			frame2.setLocationRelativeTo(frame1);
			frame2.setResizable(false);
			frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			t1=new JTextField(" ");
			t1.setColumns(20);
			JButton button2=new JButton("Submit");
			
			JPanel panel=new JPanel();
			panel.add(t1);
			panel.add(button2);
			frame2.add(panel);
			
			button2.addActionListener(this);
			frame2.setVisible(true);
		}
		else
		{
			String message=t1.getText().toString();
			label1.setText(message);
			frame2.dispose();
		}
	}
}