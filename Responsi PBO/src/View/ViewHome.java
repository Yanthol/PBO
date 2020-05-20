package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author M.S.I
 */
public class ViewHome extends JFrame{
    public JPanel backgroundawal = new JPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public JLabel ltambah = new JLabel();
    public JLabel ljudul = new JLabel("Library");
    public JLabel kata1 = new JLabel("Tis' is the main menu");
    public JLabel kata2 = new JLabel("There's nothin' here");
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btndata = new JButton("Data");
    public JButton btnabout = new JButton("About us");
    public JButton btnlogout = new JButton("Logout");
    public Font fjudul= new Font("Calibri", Font.BOLD + Font.ITALIC, 40) ;
            
        public ViewHome () {
           backgroundawal.setLayout(null);
           panel1.setLayout(null);
           panel2.setLayout(null);
           panel3.setLayout(null);
           setVisible(false);
           setSize(800,650);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setLocationRelativeTo(null);
           setTitle("Main Menu");
           
           add(backgroundawal);
           backgroundawal.add(panel1);
           backgroundawal.add(panel2);
           backgroundawal.add(panel3);
           panel1.add(ljudul);
           panel2.add(btnhome);
           panel2.add(btnpinjam);
           panel2.add(btndata);
           panel2.add(btnabout);
           panel2.add(btnlogout);
           panel3.add(kata1);
           panel3.add(kata2);
           
           backgroundawal.setBackground(Color.DARK_GRAY);
           panel1.setBackground(Color.ORANGE);
           panel2.setBackground(Color.ORANGE);
           panel3.setBackground(Color.ORANGE);
           
           ljudul.setFont(fjudul);
           kata1.setFont(new java.awt.Font("Helvetica" ,0 ,40));
           kata2.setFont(new java.awt.Font("Helvetica" ,0 ,40));
           
           backgroundawal.setBounds(0,0,800,650);
           panel1.setBounds(0,0,800,120);
           panel2.setBounds(590,130,210,800);
           panel3.setBounds(0,130,580,800);
           
           ljudul.setBounds(330,45,200,50);
           btnhome.setBounds(50,80,100,30);
           btnpinjam.setBounds(50,150,100,30);
           btndata.setBounds(50,220,100,30);
           btnabout.setBounds(50,290,100,30);
           btnlogout.setBounds(50,360,100,30);
           kata1.setBounds(100,200,400,30);
           kata2.setBounds(100,250,400,30);
        }
}
