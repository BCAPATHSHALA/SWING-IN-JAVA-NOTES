// PROGRAM:62 ADVANCED TOPIC:19 JToolBar
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI62 extends JFrame implements ActionListener
{
	JToolBar toolBar=new JToolBar();
	JButton button1=new JButton("BUTTON1");
	JButton button2=new JButton("BUTTON2");
	JTextField textField=new JTextField();
	JComboBox combo=new JComboBox(new String[]{"Item1","Item2","Item3","Item4"});
	JLabel label1=new JLabel("Nothing");
	public GUI62()
	{
		setTitle("GUI62 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		toolBar.add(combo);
		toolBar.addSeparator(); // draw the the line bw textField and CheckBox
		toolBar.add(textField);
		toolBar.addSeparator(); // draw the the line bw button and textField
		toolBar.add(button1);
		toolBar.addSeparator(); // draw the the line bw buttons
		toolBar.add(button2);
		add(toolBar,BorderLayout.NORTH);
		toolBar.setFloatable(false); // can't drag and drop the JToolBar when value: false

		add(label1);

		combo.addActionListener(this);
		textField.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);


		revalidate();
	}
	@Override 
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			label1.setText(" Button2 is clicked");
		}
		else if(e.getSource()==button2)
		{
			label1.setText(" Button1 is clicked");
		}
		else if(e.getSource()==textField)
		{
			label1.setText(textField.getText().toString()+" is typed");
		}
		else
		{
			label1.setText(combo.getSelectedItem()+" is selected");
		}
	}


	public static void main(String[] args) {
		new GUI62();
	}
}