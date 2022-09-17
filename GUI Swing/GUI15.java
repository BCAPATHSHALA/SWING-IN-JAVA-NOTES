// Program: 15 JComboBox
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI15
{
	public static void main(String[] args) 
	{
	 	JFrame jf=new JFrame("GUI15 PROGRAM");
	 	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(600,400);
		jf.setLocationRelativeTo(null);// window is in center
		jf.setResizable(false);	

		Container c=jf.getContentPane();
		c.setLayout(null);

		String []s={"MANOJ","SANOJ","AMIT","RAJAT","MANAV","ARVIND"};

		JComboBox combo=new JComboBox(s);
		c.add(combo);
		combo.setBounds(100,50,200,30);

		// JComboBox is never editable but if we want to editable then value: true
		combo.setEditable(false);

		// How to show selected item by default already
		// combo.setSelectedItem("AMIT");

		// How to show selected item via index by default already
		combo.setSelectedIndex(3);

		// set font of items
		combo.setFont(new Font("Arial",Font.ITALIC,12));


		JButton ok=new JButton("OK");
		c.add(ok);
		ok.setBounds(100,200,100,30);

		JLabel label1=new JLabel("");
		c.add(label1);
		label1.setBounds(300,200,100,30);

		// How to append the name in given combo box
		combo.addItem("DEEPAK");

		// How to remove the name in the given combo box
		combo.removeItem("AMIT");

		// Anonymous inner class
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				// Way 01: how to get item selected name
				// String item=(String)combo.getSelectedItem();
				// label1.setText(item);

				// Way 01: how to get item selected index number
				String item=String.valueOf(combo.getSelectedIndex());
				label1.setText(item);
			}
		});


		jf.setVisible(true);
	}
} 
