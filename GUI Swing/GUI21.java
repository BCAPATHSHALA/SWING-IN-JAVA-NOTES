// Program: 21 ItemListner on JComboBox via selected any item
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame implements ItemListener
{
	private Container c;
	private JComboBox combo;
	private JTextArea textArea;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		String str[]={"A","B","C","D"};
		combo=new JComboBox(str);
		c.add(combo);
		combo.setBounds(10,10,40,40);

		textArea=new JTextArea("");
		c.add(textArea);
		textArea.setBounds(200,10,200,40);

		combo.addItemListener(this);

		
	}

	public void itemStateChanged(ItemEvent e)
	{
		// String s1 =(String)combo.getSelectedItem(); OR
		String s1 =(String)combo.getSelectedItem().toString();
		textArea.setText(s1);
	}

}


class GUI21
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI21 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}