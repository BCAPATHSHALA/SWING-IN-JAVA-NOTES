// PROGRAM:60 ADVANCED TOPIC:17 JWindow 
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI60 extends JFrame implements ActionListener
{
	public GUI60()
	{
		setTitle("GUI60 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel=new JPanel();
		add(panel);

		JButton button1=new JButton("Click");
		panel.add(button1);

		button1.addActionListener(this);

		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		final JWindow win=new JWindow(); // use of final
		win.setSize(300,150);
		win.setLocationRelativeTo(null);
		win.setVisible(true);

		JPanel panel1=new JPanel();
		panel1.setBackground(Color.yellow);
		panel1.setBorder(BorderFactory.createLineBorder(Color.black));

		panel1.add(new JLabel("WELCOME WINDOW SCREEN"));
 
		win.add(panel1);

		win.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
				{
					win.dispose();
				}
			}
		});
	}


	public static void main(String[] args) {
		new GUI60();
	}
}