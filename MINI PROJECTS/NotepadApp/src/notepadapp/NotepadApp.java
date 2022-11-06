package notepadapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NotepadApp extends JFrame implements ActionListener {

    private JMenuBar menubar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenu edit = new JMenu("Edit");
    private JMenu help = new JMenu("Help");

    private JMenuItem newFile = new JMenuItem("New");
    private JMenuItem openFile = new JMenuItem("Open");
    private JMenuItem saveFile = new JMenuItem("Save");
    private JMenuItem print = new JMenuItem("Print");
    private JMenuItem exit = new JMenuItem("Exit");

    private JMenuItem copy = new JMenuItem("Copy");
    private JMenuItem cut = new JMenuItem("Cut");
    private JMenuItem paste = new JMenuItem("Paste");
    private JMenuItem selectall = new JMenuItem("Select All");

    private JMenuItem about = new JMenuItem("About");

    private JTextArea textarea = new JTextArea();

    public NotepadApp() {
        setTitle("Notepad Application");
        setBounds(100, 100, 800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(getClass().getResource("notepad_icon.png"));
        setIconImage(icon.getImage());

        setJMenuBar(menubar);
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.add(print);
        file.add(exit);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);
        help.add(about);

        JScrollPane scrollpane = new JScrollPane(textarea);
        add(scrollpane);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollpane.setBorder(BorderFactory.createEmptyBorder());

        textarea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);

        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        print.addActionListener(this);
        exit.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectall.addActionListener(this);
        about.addActionListener(this);
        
        
        //step:08
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
        saveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        openFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,KeyEvent.CTRL_DOWN_MASK));
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));
        selectall.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,KeyEvent.CTRL_DOWN_MASK));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("new")) {
            textarea.setText(null);
        } else if (e.getActionCommand().equalsIgnoreCase("open")) {
            
            JFileChooser filechooser=new JFileChooser();
            FileNameExtensionFilter textFilters=new FileNameExtensionFilter("Only text file(.txt)","txt");
            filechooser.setAcceptAllFileFilterUsed(false);
            filechooser.addChoosableFileFilter(textFilters);
            
            int action=filechooser.showOpenDialog(null);
            if(action!=filechooser.APPROVE_OPTION)
            {
                return;
            }
            else
            {
                          
                try {
                                      
                    BufferedReader reader=new BufferedReader(new FileReader(filechooser.getSelectedFile()));
                    textarea.read(reader,null);
                } catch (IOException ex) 
                {
                 
                }
            }
            
            
            
            
        }else if (e.getActionCommand().equalsIgnoreCase("save")) {
            JFileChooser filechooser=new JFileChooser();
            FileNameExtensionFilter textFilters=new FileNameExtensionFilter("Only text file(.txt)","txt");
            filechooser.setAcceptAllFileFilterUsed(false);
            filechooser.addChoosableFileFilter(textFilters);
            
            int action=filechooser.showSaveDialog(null);
            if(action!=filechooser.APPROVE_OPTION)
            {
                return;
            }
            else
            {
                String fileName=filechooser.getSelectedFile().getAbsolutePath().toString();
                if(!fileName.contains(".txt"))
                {
                    fileName=fileName+".txt";
                }
                
                try {
                    BufferedWriter writer=new BufferedWriter(new FileWriter(fileName));
                    textarea.write(writer);
                } catch (IOException ex) 
                {
                       ex.printStackTrace();
                }
            }
            
            
        }else if (e.getActionCommand().equalsIgnoreCase("print")) {
            
            try {
                textarea.print();
            } catch (PrinterException ex) {
                   ex.printStackTrace();
            }
            
            
        }else if (e.getActionCommand().equalsIgnoreCase("exit")) {
            
            System.exit(0);
            
        }else if (e.getActionCommand().equalsIgnoreCase("cut")) {
            
            textarea.cut();
            
        }else if (e.getActionCommand().equalsIgnoreCase("copy")) {
            
            textarea.copy();
            
        }else if (e.getActionCommand().equalsIgnoreCase("paste")) {
            
            textarea.paste();
            
        }else if (e.getActionCommand().equalsIgnoreCase("select all")) {
            
            textarea.selectAll();
            
        }else if (e.getActionCommand().equalsIgnoreCase("about")) {
            
            new About().setVisible(true);
        }
    }

    public static void main(String[] args) throws Exception{
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        new NotepadApp().setVisible(true);
    }

}
