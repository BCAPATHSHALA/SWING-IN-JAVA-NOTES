//Billing system
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class BillingSystem extends JFrame implements ActionListener
{
	JLabel label1,label2,label3,label4;
	JTextField textField1, textField2, textField3;
	JButton button1, button2;
	JTextArea textArea;
	public BillingSystem()
	{
		setTitle("Billing System");
		setSize(800,450);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

		label1=new JLabel("Electricity Billing System");
		label2=new JLabel("Customer ID");
		label3=new JLabel("Customer Name");
		label4=new JLabel("Unit");

		textField1=new JTextField();
		textField2=new JTextField();
		textField3=new JTextField();

		textArea=new JTextArea();
		textArea.setSize(300,180);
		textArea.setLocation(400,100);
		add(textArea);

		button1=new JButton("OK");
		button2=new JButton("Print");
		button2.setBounds(500,300,100,25);
		add(button2);

		label1.setBounds(320,20,200,50);
		add(label1);
		label2.setBounds(100,100,100,25);
		add(label2);
		label3.setBounds(100,150,100,25);
		add(label3);
		label4.setBounds(100,200,100,25);
		add(label4);

		textField1.setBounds(200,100,120,25);
		add(textField1);
		textField2.setBounds(200,150,120,25);
		add(textField2);
		textField3.setBounds(200,200,120,25);
		add(textField3);

		button1.setBounds(100,250,220,25);
		add(button1);		

		setVisible(true);
		revalidate();

		button1.addActionListener(this);
		button2.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==button1)
			{
				if(textField1.getText().isEmpty() || textField2.getText().isEmpty() || textField3.getText().isEmpty())
				{
						JOptionPane.showMessageDialog(null,"Please fill all field.","error",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						int cusID=Integer.parseInt(textField1.getText().toString());
						String cusName=textField2.getText().toString();
						int unit=Integer.parseInt(textField3.getText().toString());
						int unitBill=1;
						if(unit<=10)
						{
							unitBill=unit*5;
						}
						else if(unit>=11 || unit<=50)
						{
							unitBill=unit*10;
						}
						else
						{
							unitBill=unit*15;
						}
						
						textArea.setText("Customer ID: "+cusID+" \nCustomer Name: "+cusName+" \nUnit: "+unit+" \nUnit Bill Payment: "+unitBill);
						
						textField1.setText(null);
						textField2.setText(null);
						textField3.setText(null);
				}
			}
			else
			{
				return;
			}
		}
		catch(NumberFormatException excp)
		{

		}
	}


	public static void main(String[] args) 
	{
		new BillingSystem();
	}
}