// Program: 24 ItemListner on JCheckBoxMenuItem via clicking
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements ItemListener
{
	private Container c;
	private JTextArea textArea;
	private JMenuBar menubar;
	private JMenu file;
	private JCheckBoxMenuItem menuItem1, menuItem2;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		textArea=new JTextArea("");
		c.add(textArea);
		textArea.setBounds(250,20,300,300);
		textArea.setBackground(Color.GREEN);

		menubar=new JMenuBar();
		file=new JMenu("File");
		menuItem1=new JCheckBoxMenuItem("Print");
		menuItem2=new JCheckBoxMenuItem("Save");

		file.add(menuItem1);
		file.add(menuItem2);

		menubar.add(file);

		this.setJMenuBar(menubar);

		menuItem1.addItemListener(this);
		menuItem2.addItemListener(this);

	}

	public void itemStateChanged(ItemEvent e)
	{
		if (menuItem1.isSelected()) 
		{
			textArea.setText("Print ....");	
		}
		if(menuItem2.isSelected())
		{
			textArea.setText(textArea.getText()+"\n"+"Save ....");
		}
	}

}


class GUI24
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI24 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}