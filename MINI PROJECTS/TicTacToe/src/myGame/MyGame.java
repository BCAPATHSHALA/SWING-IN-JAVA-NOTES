package myGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MyGame extends JFrame implements ActionListener{
    
    JLabel heading,clockLabel;
    Font font=new Font("",Font.BOLD,40);
    JPanel mainPanel;
    JButton []btns=new JButton[9];
    
    //get instance variables
    int gameChances[]={2,2,2,2,2,2,2,2,2};
    int activePlayer=0;
    
    int wps[][]={
        {0,1,2},
        {3,4,5},
        {6,7,8},
        {0,3,6},
        {1,4,7},
        {2,5,8},
        {0,4,8},
        {2,4,6},
    };
    
    int winner=2;
    
    
    boolean gameOver=false; // game abhi chal rha hai
    
    public MyGame()
    {
        setTitle("My Tic Tac Toe Game..");
        setSize(700,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon icon=new ImageIcon("src/image/icon.png");
        setIconImage(icon.getImage());
        
        
        createGUI();
        setVisible(true);
    }
    
    private void createGUI()
    {
        this.getContentPane().setBackground(Color.decode("#2196f3"));
        this.setLayout(new BorderLayout());
        
        //North Heading..
        heading=new JLabel("Tic Tac Toe");
        heading.setForeground(Color.white);
        heading.setFont(font);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(heading,BorderLayout.NORTH);
        
        
        //South Clock.
        clockLabel=new JLabel("Clock");
        clockLabel.setForeground(Color.white);
        clockLabel.setFont(font);
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(clockLabel,BorderLayout.SOUTH);
        
        
        //Set Time start
        Thread t=new Thread()
        {
            public void run()
            {
                try
                {
                    while(true)
                    {
                        String dateTime=new Date().toLocaleString();
                        clockLabel.setText(dateTime);
                        Thread.sleep(1000);
                    }
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        
        t.start();
        //Set Time  end
        
        ////////////
        //panel section......
        ///////////
        mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(3,3));
        
        for(int i=1;i<=9;i++)
        {
            JButton btn=new JButton();
//            btn.setIcon(new ImageIcon("src/image/zero.png"));
            btn.setBackground(Color.decode("#90caf9"));
            btn.setFont(font);
            mainPanel.add(btn);
            btns[i-1]=btn;
            btn.addActionListener(this);
            btn.setName(String.valueOf(i-1)); // set the each button name 0 1 2 3 4 5 6 7 8
        }
        
        this.add(mainPanel,BorderLayout.CENTER);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton currentButton=(JButton)e.getSource();
        
        String nameStr=currentButton.getName();
        
        int name=Integer.parseInt(nameStr.trim());
        
        if(gameOver==true)
        {
            JOptionPane.showMessageDialog(this, "Game already over.");
            return;
        }
        
        
        
        if(gameChances[name]==2)
        {
            if(activePlayer==1)
            {
                currentButton.setText("X"); //1
                currentButton.setFont(font);
                gameChances[name]=activePlayer;
                activePlayer=0;
            }
            else
            {
                currentButton.setText("0");
                currentButton.setFont(font);
                gameChances[name]=activePlayer;
                activePlayer=1;
            }
            
            //find the winner....
            for(int temp[]: wps)
            {
                if((gameChances[temp[0]]==gameChances[temp[1]] )&& (gameChances[temp[1]]==gameChances[temp[2]] )&& gameChances[temp[2]]!=2 )
                {
                    winner=gameChances[temp[0]];
                    
                    gameOver=true;
                    
                    JOptionPane.showMessageDialog(null,"player "+winner+" has won the game.");
                    int i=JOptionPane.showConfirmDialog(this, "Do you want to play more ?");
                    if(i==0)
                    {
                        this.setVisible(false);
                        new MyGame();
                    }
                    else if(i==1)
                    {
                        System.exit(22222222);
                    }
                    else
                    {
                        
                    }
                    System.out.println(i);
                    break;
                }
            }
            
            
            // draw the game
            int c=0;
            
            for(int x:gameChances)
            {
                if(x==2)
                {
                    c++;
                    break;
                }
            }
            
            if(c==0&&gameOver==false)
            {
                JOptionPane.showMessageDialog(this, "Its draw");
                int i=JOptionPane.showConfirmDialog(this, "Play more??");
                if(i==0)
                {
                    this.setVisible(false);//yes=0
                    new MyGame();
                }
                else if(i==1)
                {
                    System.exit(2222);//no=1
                }
                else
                {
                    //cancel=2
                }
                
                gameOver=true;
                
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Position already occupied.");
        }
        
                
    }
    
}
