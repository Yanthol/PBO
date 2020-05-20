package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ViewLogin extends JFrame{
    public JLabel lJudul = new JLabel("Login ");
    public JLabel lUsername = new JLabel("Username");
    public JTextField tfUsername = new JTextField();
    
    public JLabel lPass = new JLabel("Password");
    public JPasswordField tfPass = new JPasswordField();
    
    public JButton btnLogin = new JButton("Login");
    public JButton btnExit = new JButton("Exit");
    public JPanel panelbackground = new JPanel (); 

    public ViewLogin(){
        setTitle("PERPUSTAKAAN LOGIN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        panelbackground.setLayout(null);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnLogin);
        
        add(panelbackground) ;
        panelbackground.add(lJudul);
        panelbackground.add(lUsername);
        panelbackground.add(tfUsername);
        panelbackground.add(lPass);
        panelbackground.add(tfPass);
        panelbackground.add(btnLogin);
        panelbackground.add(btnExit);
        
        lUsername.setFont(new java.awt.Font("Calibri", 0, 18));
        lPass.setFont(new java.awt.Font("Calibri", 0, 18));
        lJudul.setFont(new java.awt.Font("Calibri", 0, 18));
        
        panelbackground.setBackground(Color.DARK_GRAY);
        btnLogin.setBackground(Color.WHITE);
        btnLogin.setForeground(Color.BLACK);
        btnExit.setBackground(Color.RED);
        btnExit.setForeground(Color.BLACK);
        lJudul.setForeground(Color.WHITE);
        lUsername.setForeground(Color.WHITE);
        lPass.setForeground(Color.WHITE);
        
        panelbackground.setBounds(0,0,350,400); 
        lJudul.setBounds(170,40,200,20);  
        lUsername.setBounds(60, 100, 120, 25);       
        tfUsername.setBounds(60, 125, 260, 25);
        lPass.setBounds(60, 155, 120, 25);       
        tfPass.setBounds(60, 180, 260, 25);
        btnLogin.setBounds (80,230,100,30);
        btnExit.setBounds(200,230,100,30);
        
    }
}

