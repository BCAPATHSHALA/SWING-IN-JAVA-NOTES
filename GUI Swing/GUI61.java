// PROGRAM:61 ADVANCED TOPIC:18 WELCOME SCREEN
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI61 extends JFrame
{
	Timer timer;
	public GUI61()
	{

		displayWelcomeScreen();
		/*.........................*/
		setTitle("GUI61 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label1=new JLabel("WELCOME SCREEN😄");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		add(label1);

		// setVisible(true);
	}

	private void displayWelcomeScreen()
	{
		final JWindow win=new JWindow(this);
		win.setSize(600,400);
		win.setLocationRelativeTo(null);
		win.setVisible(true);

		JPanel panel2=new JPanel();
		win.add(panel2);
		panel2.setBorder(BorderFactory.createLineBorder(Color.black));

		//set image
		JLabel label2=new JLabel(new ImageIcon("image\\java1.png"));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		panel2.add(label2);


		JProgressBar progress=new JProgressBar(0,100);
		win.add(BorderLayout.PAGE_END, progress);
		//Change Progress bar color
		progress.setForeground(Color.orange);

		// progressbar ko show karne ke liye revalidate() method ka use krte hai
		win.revalidate();

		timer=new Timer(100, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				int x=progress.getValue();
				if(x==100)
				{
					win.dispose();
					GUI61.this.setVisible(true);
					timer.stop();
				}
				else
				{
					progress.setValue(x+4);
				}
			}
		});

		timer.start();
	}


	public static void main(String[] args) {
		new GUI61();
	}
}