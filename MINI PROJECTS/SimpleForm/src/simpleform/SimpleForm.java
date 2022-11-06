package simpleform;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SimpleForm {

   
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       MyWindow w=new MyWindow();
    }
    
}
