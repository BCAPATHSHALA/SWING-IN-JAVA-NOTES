// PROGRAM:53 ADVANCED TOPIC:11 JSlider is the tool like brightness tool
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI53 extends JFrame implements ChangeListener
{
	private JSlider s;
	private JLabel label1;
	public GUI53()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI52 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new FlowLayout());

		s=new JSlider();
		add(s);
		s.setOrientation(JSlider.VERTICAL);

		s.setMinimum(0);
		s.setMaximum(200);

		s.setPaintTicks(true);
		s.setPaintLabels(true);

		s.setMajorTickSpacing(50);
		s.setMinorTickSpacing(5);

		label1=new JLabel();
		add(label1);
		label1.setText("The value of slider: "+s.getValue());

		s.addChangeListener(this);
		
		setVisible(true);
		validate();
	}

	@Override
	public void stateChanged(ChangeEvent e)
	{
		label1.setText("The value of slider: "+s.getValue());
	}

	public static void main(String[] args) 
	{
		new GUI53();
	}
} 