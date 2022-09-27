// PROGRAM:56 ADVANCED TOPIC:14 JEditorPane
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI56 extends JFrame
{
	private JEditorPane editor;
	public GUI56()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI56 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);

		editor=new JEditorPane();
		/* How to create a plain text editor
		editor.setContentType("text/plain");
		editor.setText("If a page was recently created here, it may not be visible yet because of a delay in updating the database; wait a few minutes or try the purge function.");
		
		add(editor,BorderLayout.CENTER);		
		*/

		// How to create a Html code editor
		editor.setContentType("text/html");
		editor.setText("<html>"+"<h1 color='red'>Hello World</h1>"
						+"<p>This is my paragraph</p>"
						+"<hr>"
						+"<ol>"
						+"<li>item1</li>"
						+"<li>item2</li>"
						+"<li>item3</li>"
						+"</ol>"
						+"</html>");
		
		add(editor,BorderLayout.CENTER);	

		JButton button1=new JButton("Show Code");
		add(button1,BorderLayout.PAGE_END);

		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println(editor.getText());
			}
		});	
		

		setVisible(true);
		validate();
	}

	public static void main(String[] args) 
	{
		new GUI56();
	}
} 