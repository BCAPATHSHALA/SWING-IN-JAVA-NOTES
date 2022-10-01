// PROGRAM:64 ADVANCED TOPIC:20 JList PART:02 how to create dynamic list
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI64 extends JFrame
{
	JTextField textField=new JTextField();
	JButton button1=new JButton("Add");
	JButton button2=new JButton("Update");
	JButton button3=new JButton("Delete");

	int updateIndex=0;

	JList list;

	public GUI64()
	{
		setTitle("GUI64 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new GridLayout(1,2));

		list=new JList();
		JPanel panel1=new JPanel();
		panel1.add(new JScrollPane(list));
		add(panel1);

		//Dynamic list code
		DefaultListModel model=new DefaultListModel();
		model.addElement("BCA");
		model.addElement("MCA");
		model.addElement("B. Tech");
		list.setModel(model);

		JPanel panel2=new JPanel();
		add(panel2);
		panel2.add(textField);
		textField.setColumns(25);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);

		//code for add new element
		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(!textField.getText().isEmpty())
				{
					String newItems=textField.getText().toString();
					model.addElement(newItems);
					textField.setText(null);
				}
			}
		});

		// code for containing the exist element to the textfield
		list.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount()==2)
				{
					updateIndex=list.getSelectedIndex();
					textField.setText((String)model.get(updateIndex));
				}
			}
		});

		//code for update the exist element
		button2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(!textField.getText().isEmpty())
				{
					String existItems=textField.getText().toString();
					model.set(updateIndex,existItems);
					textField.setText(null);
				}
			}
		});

		//Code for delete the exist code
		button3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				if(list.getSelectedIndex()==-1)
				{
					JOptionPane.showMessageDialog(null,"Please select a element.","Error",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					updateIndex=list.getSelectedIndex();
					model.remove(updateIndex);
				}
			}
		});


		revalidate();
	}

	public static void main(String[] args) {
		new GUI64();
	}
}