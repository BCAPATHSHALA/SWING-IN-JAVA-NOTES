// Program: 16 SIMPLE REGISTRATION FORM
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class MyFrame extends JFrame
{
	private JLabel formName, nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel, result;
	private JTextField nameText, mobileText;
	private JRadioButton maleRadio, femaleRadio;
	private JComboBox dayBox,monthBox,yearBox;
	private JTextArea addressArea, finalOutputArea;
	private JCheckBox condition;
	private JButton button; 

	public MyFrame()
	{
		JFrame jf=new JFrame("GUI16: SIMPLE REGESTRATION FORM");
		jf.setSize(650,400);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);

		Container c=jf.getContentPane();
		c.setLayout(null);

		formName=new JLabel("REGISTRATION FORM");
		c.add(formName);
		formName.setBounds(230,20,200,20);

		nameLabel=new JLabel("Name");
		c.add(nameLabel);
		nameLabel.setBounds(50,50,100,15);

		nameText=new JTextField();
		c.add(nameText);
		nameText.setBounds(150,50,100,18);

		mobileLabel=new JLabel("Mobile");
		c.add(mobileLabel);
		mobileLabel.setBounds(50,80,100,15);

		mobileText=new JTextField();
		c.add(mobileText);
		mobileText.setBounds(150,80,100,18);

		genderLabel=new JLabel("Gender");
		c.add(genderLabel);
		genderLabel.setBounds(50,110,100,15);

		maleRadio=new JRadioButton("Male");
		c.add(maleRadio);
		maleRadio.setBounds(150,110,100,15);
		maleRadio.setSelected(true);

		femaleRadio=new JRadioButton("Female");
		c.add(femaleRadio);
		femaleRadio.setBounds(250,110,100,15);

		// Select only one radio among these like: male, female
		ButtonGroup gender=new ButtonGroup();
		gender.add(maleRadio);
		gender.add(femaleRadio);

		dobLabel=new JLabel("DOB");
		c.add(dobLabel);
		dobLabel.setBounds(50,140,100,15);

		String day[]={"1","2","3","4","5","6","7","8"};
		String year[]={"2022","2021","2020","2019","2018"
					,"2017","2016","2015","2014"};		
		String month[]={"Jan","Feb","Mar","Apr","May","Jun",
						"Jul","Aug","Sep","Oct","Num","Dec"};
		dayBox=new JComboBox(day);
		c.add(dayBox);
		dayBox.setBounds(150,140,50,20);

		monthBox=new JComboBox(month);
		c.add(monthBox);
		monthBox.setBounds(220,140,50,20);

		yearBox=new JComboBox(year);
		c.add(yearBox);
		yearBox.setBounds(290,140,60,20);

		addressLabel=new JLabel("Address");
		c.add(addressLabel);
		addressLabel.setBounds(50,170,100,15);

		addressArea=new JTextArea("type your address...");
		c.add(addressArea);
		addressArea.setBounds(150,170,150,50);
		addressArea.setLineWrap(true);

		condition=new JCheckBox("Please accept terms and conditions.");
		c.add(condition);
		condition.setBounds(50,220,250,15);
		

		button=new JButton("Submit");
		c.add(button);
		button.setBounds(100,250,100,25);

		result=new JLabel("");
		c.add(result);
		result.setBounds(50,300,400,25);

		finalOutputArea=new JTextArea("registration result ");
		c.add(finalOutputArea);
		finalOutputArea.setBounds(380,50,200,250);
		finalOutputArea.setLineWrap(true);

		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{

				if(condition.isSelected())
				{
					result.setText("Registration successfull!!\n");

					String gn="";
					if(femaleRadio.isSelected())
					{
						gn="Female";
					}
					else
					{
						gn="Male";
					}
					finalOutputArea.setText("Name: "+nameText.getText()
								+"\nMobile: "+mobileText.getText()
								+"\nDOB: "+dayBox.getSelectedItem()+"-"+monthBox.getSelectedItem()+"-"+yearBox.getSelectedItem()
								+"\nGender: "+gn+"\nAddress: "+addressArea.getText());

				}
				else
				{
					result.setText("Please accept the terms and conditions to submit.");
					finalOutputArea.setText("");
				}
			}
		});

		jf.setVisible(true);
	}
}


class GUI16
{
	public static void main(String[] args) 
	{
		MyFrame obj=new MyFrame();
	}
}