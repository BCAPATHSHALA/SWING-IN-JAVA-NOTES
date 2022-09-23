// PROGRAM:46 ADVANCED TOPIC:05 JProgressBar
// how to create a simple progress bar
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;

public class GUI46
{
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("GUI46 PROGRAM");
		jf.setSize(650,400);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);

		jf.setLayout(new FlowLayout());

		JProgressBar progress=new JProgressBar(0,100);
		jf.add(progress);
		progress.setStringPainted(true);
		// progress.setOrientation(SwingConstants.VERTICAL);

		jf.setVisible(true);

		// to increase the progress percentage
		
			int i=0;
			while(i<=100)
			{
				// show the string in the progress bar
				if(i>=0 && i<=20)
					progress.setString("Progressing....");
				else if(i>=21 && i<=40)
					progress.setString("Near to middle..");
				else if(i>=41 && i<100)
					progress.setString("Crossing middle...");
				else if (i==100)
					progress.setString("Finished");
				
				// show the percentage in the progress bar
				// progress.setValue(i);

				try
				{
					Thread.sleep(1000); // show the string or value progress 
										//after 1 second and and and .... if is completed
				}
				catch(Exception e){}
				i=i+10;
			}
	}
}

 