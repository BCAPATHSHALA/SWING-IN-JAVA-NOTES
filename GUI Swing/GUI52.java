// PROGRAM:52 ADVANCED TOPIC:09 JTooltip is the popup message
package guiFolder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.lang.*;
import javax.swing.event.*;

public class GUI52 extends JFrame
{

	public GUI52()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI52 PROGRAM");
		setSize(650,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		JLabel label1=new JLabel("PASSWORD");
		add(label1);
		label1.setBounds(100,100,100,25);

		JPasswordField passward=new JPasswordField();
		add(passward);
		passward.setBounds(200,100,100,25);

		/* single line ToolTip
		passward.setToolTipText("Enter your password"); 
		*/

		//Multi line tooltip and formatted tooltip
		String str="<html>"+"<div bgcolor='#800080' color='#ffffff'>"
					+"Enter your password"+"<br/>"
					+"Password should be atleast 8 Character long"
					+"</div>"
					+"</html>";

		passward.setToolTipText(str);


		setVisible(true);
		validate();
	}

	public static void main(String[] args) 
	{
		new GUI52();
	}
} 