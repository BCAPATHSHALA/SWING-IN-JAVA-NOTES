package notepadapp;
import java.awt.*;
import javax.swing.*;

public class About extends JFrame {
    
    public About()
    {
        setTitle("About Notepad Application");
        setBounds(100,100,600,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ImageIcon icon=new ImageIcon(getClass().getResource("notepad_icon.png"));
        setIconImage(icon.getImage());
    
        setLayout(null);
        
        JLabel aboutLabel=new JLabel("<html><h2>Notepad App</h2>This is simple text editor application made by BCA Pathshala</html>");
        add(aboutLabel);
        aboutLabel.setBounds(50,20,400,100);
        aboutLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        
        JLabel imageLabel=new JLabel(new ImageIcon(getClass().getResource("notepad_icon.png")));
        add(imageLabel);
        imageLabel.setSize(getWidth(),getHeight());
        imageLabel.setLocation(10,20);
    }
    
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new About().setVisible(true);
    }
    
}
