package simpleform;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class MyWindow extends JFrame
{
    private JLabel heading;
    Font font=new Font("",Font.BOLD,20);
    
    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1,button2;
    
    
    
    public MyWindow()
    {
        super.setTitle("My First Form..");
        super.setSize(400,400);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.createGUI();
        
        super.setVisible(true);
    }
    
    public void createGUI()
    {
        this.setLayout(new BorderLayout());
        
        heading=new JLabel("My First Form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);        
        this.add(heading,BorderLayout.NORTH);
        
        ///////////working with JPanle
        
        mainPanel=new JPanel();
        
        //setting layout of main panel..
        mainPanel.setLayout(new GridLayout(3,2));
        
        nameLabel=new JLabel("Enter name :");
        nameLabel.setFont(font);
        
        passwordLabel=new JLabel("Enter password :");
        passwordLabel.setFont(font);
        
        nameTextField=new JTextField();
        nameTextField.setFont(font);
        
        passwordField=new JPasswordField();
        passwordField.setFont(font);
        
        button1=new JButton("Submit");
        button1.setFont(font);
        
        button2=new JButton("Reset");
        button2.setFont(font);
        
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(button1);
        mainPanel.add(button2);
        
        this.add(mainPanel,BorderLayout.CENTER);      
    }
    
}
