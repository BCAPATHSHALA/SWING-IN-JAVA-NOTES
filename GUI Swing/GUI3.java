// Program: 03 for JTextField class
package guiFolder;
import javax.swing.*;
import java.awt.*;

public class GUI3
{
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(500,300,600,400);
		jf.setTitle("GUI3 PROGRAM");
		jf.setResizable(false);
		Container c= jf.getContentPane();
		c.setLayout(null);

		JTextField t1=new JTextField();
		c.add(t1); // contans the text field in container frame
		t1.setBounds(100,50,120,30);
		t1.setForeground(Color.RED); // set text froeground
		t1.setBackground(Color.YELLOW); // set text filed background

		Font font=new Font("Arial",Font.BOLD, 16);
		t1.setFont(font);// set text font

		t1.setText("Manoj Kumar");// set text in textfield
		t1.setEditable(true); //text is not editable when Value: false





		
	}
}