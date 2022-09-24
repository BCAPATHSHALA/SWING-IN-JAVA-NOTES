// PROGRAM:48 ADVANCED TOPIC:06 JCheckBoxMenuItem
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;

public class GUI48 extends JFrame
{
	private JMenuBar menubar;
	private JMenu file,edit,format;
	private JMenuItem newFile,open,undo,redo;
	private JCheckBoxMenuItem wordWarp;
	private JTextArea textArea;
	public GUI48()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI48 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		
		menubar=new JMenuBar();
		add(menubar,BorderLayout.PAGE_START);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");

		menubar.add(file);
		menubar.add(edit);
		menubar.add(format);

		newFile=new JMenuItem("New File");
		open=new JMenuItem("Open");
		undo=new JMenuItem("Undo");
		redo=new JMenuItem("Redo");

		wordWarp=new JCheckBoxMenuItem("Word Wrap");

		file.add(newFile);
		file.add(open);
		edit.add(undo);
		edit.add(redo);
		format.add(wordWarp);

		textArea=new JTextArea("that the slopes near Bass Lake at Flat Top Manor in North Carolina were covered with hundreds of apple trees... that Rockstar Vancouver developed most of the update for Counter-Strike?... that Iraqi psychologist Nuri Ja'far, in his youth, was denied admission to the College of Medicine University of Baghdad by Harry Sinderson? ");
		add(textArea,BorderLayout.CENTER);

		wordWarp.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(wordWarp.isSelected())
				{
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);
				}
				else
				{
					textArea.setLineWrap(false);
					textArea.setWrapStyleWord(false);
				}
			}
		});

		setVisible(true);
		validate();
	}
 
	public static void main(String[] args) 
	{
		GUI48 jf=new GUI48();
	}
}



