// PROGRAM:51 ADVANCED TOPIC:09 JSpinner is used to select a number or object value from an order sequence
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI51 extends JFrame implements ChangeListener
{
	String arr[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Num","Dec"};
	JSpinner s1,s2,s3;
	SpinnerModel date,month,year;
	JLabel label1=new JLabel("");
	public GUI51()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI51 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		String str1=String.valueOf(java.time.Year.now());
		int currentYear=Integer.parseInt(str1);

		date=new SpinnerNumberModel(1,1,31,1);
		month=new SpinnerListModel(arr);
		year=new SpinnerNumberModel(currentYear,currentYear-100,currentYear,1);

		s1=new JSpinner(date);
		s2=new JSpinner(month);
		s3=new JSpinner(year);

		s1.setBounds(100,20,100,50);
		s2.setBounds(250,20,100,50);
		s3.setBounds(400,20,100,50);

		add(s1);
		add(s2);
		add(s3);

		s1.addChangeListener(this);
		s2.addChangeListener(this);
		s3.addChangeListener(this);

		label1.setBounds(100,100,150,50);
		add(label1);

		setDOB(); // call method setDOB()



		setVisible(true);
		validate();
	}

	public static void main(String[] args) 
	{
		new GUI51();
	}

	public void setDOB()
	{
		int date=(Integer)s1.getValue();
		int year=(Integer)s3.getValue();
		String month=(String)s2.getValue();

		label1.setText("DOB is: "+date+"/"+month+"/"+year);
	}

	@Override
	public void stateChanged(ChangeEvent e)
	{
		//reset the DOB in label
		setDOB();
	}
} 