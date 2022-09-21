// PROGRAM:4 ADVANCED TOPIC:01 JTable PART:03 Update new row
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.lang.NumberFormatException;

public class GUI4
{
	public static void main(String[] args) 
	{
		
		MyTable obj=new MyTable();	
	}	
}

class MyTable extends JFrame
{
	JTable table;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;

	public MyTable()
	{
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI4 Table");
		setVisible(true);	

		Object [][] rowData={{001,"MANOJ NISHAD",24},
						{002,"AMIT TIWARI",20},
						{003,"RAJAT THAKUR",21}};

		String [] columNames={"ROLL NO", "NAME", "AGE"};

		DefaultTableModel model=new DefaultTableModel(rowData,columNames);
		table=new JTable(model);
		

		// PART:02
		setLayout(new GridLayout(3,1));

		JPanel panel=new JPanel();
		add(new JScrollPane(table)); // ROW:01		
		add(new JPanel()); // ROW:02(GAPING)
		add(panel); // ROW:03

		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();

		b1=new JButton("Add");
		b2=new JButton("Update");
		b3=new JButton("Delete");

		panel.setLayout(new GridLayout(3,3));
		panel.add(new JLabel("Roll No"));
		panel.add(t1);
		panel.add(b1);

		panel.add(new JLabel("Name"));
		panel.add(t2);
		panel.add(b2);

		panel.add(new JLabel("Age"));
		panel.add(t3);
		panel.add(b3);

		validate();// to refrece the window


		// Add the new row
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() || t3.getText().toString().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please fill all text field.","Error",JOptionPane.ERROR_MESSAGE);
				}	
				else
				{
					int rool_no=Integer.parseInt(t1.getText().toString());
					String name=t2.getText().toString();
					int age=Integer.parseInt(t3.getText().toString());

					Object[] newRow={rool_no,name,age};
					model.addRow(newRow); // Add new row

					// data add hone ke bad textfield null ho jayen uske liye code
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
			    }
			}
		});
		
		//PART: 03
		// Select the table row
		table.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				int rowIndex=table.getSelectedRow(); // assume get row index=0

				int rool_no=(int)model.getValueAt(rowIndex,0); // (0,0) fetch the row data
				String name=(String)model.getValueAt(rowIndex,1); // (0,1)
				int age=(int)model.getValueAt(rowIndex,2); // (0,2)

				t1.setText(String.valueOf(rool_no));
				t2.setText(name);
				t3.setText(String.valueOf(age));
			}
		});

		// Update the row
		b2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() || t3.getText().toString().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please fill all text field.","Error",JOptionPane.ERROR_MESSAGE);
				}	
				else
				{
					int rool_no=Integer.parseInt(t1.getText().toString());
					String name=t2.getText().toString();
					int age=Integer.parseInt(t3.getText().toString());

					int oldRow=table.getSelectedRow(); // fetch the row index
					model.setValueAt(rool_no,oldRow,0); // Update roll no
					model.setValueAt(name,oldRow,1); // Update name
					model.setValueAt(age,oldRow,2); // Update age

					// data add hone ke bad textfield null ho jayen uske liye code
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
			    }
			}
		});
	}
}

 