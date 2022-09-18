// Program: 29 CaretListner that support every text component
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;


class MyFrame extends JFrame implements CaretListener
{
	private Container c;
	private JTextArea textArea;
	private JTextField t1;

	public MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);

		textArea=new JTextArea("");
		c.add(textArea);
		textArea.setBounds(250,20,300,300);
		textArea.setBackground(Color.GREEN);

		t1=new JTextField("Caret Event");
		c.add(t1);
		t1.setBounds(100,50,100,25);

		t1.addCaretListener(this);

	}

	@Override
	public void caretUpdate(CaretEvent e)
	{
		textArea.setText(textArea.getText()+"\n"+"Caret Updated: "+e.getDot()+"  :  "+e.getMark());
	}
}


class GUI29
{
	public static void main(String[] args) 
	{
		MyFrame jf=new MyFrame();
		jf.setTitle("GUI29 PROGRAM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);		
		jf.setVisible(true);
	}
		
}