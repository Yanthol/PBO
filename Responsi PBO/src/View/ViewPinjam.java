/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author M.S.I
 */
public class ViewPinjam extends JFrame{
    public JLabel ljudul = new JLabel("Library");
    public JLabel ljudulpinjam = new JLabel("Peminjaman");
    public JLabel lidmember = new JLabel("ID Member         :");
    public JLabel lnama = new JLabel("Nama Member   :");
    public JLabel lidbuku = new JLabel("ID Buku              :");
    public JLabel ljudulbuku = new JLabel("Judul Buku         :");
    public JTextField tfidmember = new JTextField();
    public JTextField tfnama = new JTextField();
    public JTextField tfidbuku = new JTextField();
    public JTextField tfjudulbuku = new JTextField();
    public JButton btnadd = new JButton("Add");
    public JButton btnreset = new JButton("Reset");
    public JPanel background = new JPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btndata = new JButton("Data");
    public JButton btnabout = new JButton("About us");
    public JButton btnlogout = new JButton("Logout");
    public Font fjudul= new Font("Calibri", Font.BOLD + Font.ITALIC, 40) ;
    
    public ViewPinjam () {
        background.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        setVisible(false);
        setSize(800,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Pinjam Buku");
        
        add(background);
        background.add(panel1);
        background.add(panel2);
        background.add(panel3);
        panel1.add(ljudul);
        panel2.add(btnhome);
        panel2.add(btnpinjam);
        panel2.add(btndata);
        panel2.add(btnabout);
        panel2.add(btnlogout);
        panel3.add(ljudulpinjam);
        panel3.add(lidmember);
        panel3.add(lnama);
        panel3.add(lidbuku);
        panel3.add(ljudulbuku);
        panel3.add(tfidmember);
        panel3.add(tfnama);
        panel3.add(tfidbuku);
        panel3.add(tfjudulbuku);
        panel3.add(btnadd);
        panel3.add(btnreset);
        
        ljudul.setFont(new java.awt.Font("Helvetica", 0, 20));
        lidmember.setFont(new java.awt.Font("Helvetica", 0, 18));
        lidbuku.setFont(new java.awt.Font("Helvetica", 0, 18));
        ljudulbuku.setFont(new java.awt.Font("Helvetica", 0, 18));
        lnama.setFont(new java.awt.Font("Helvetica", 0, 18));
        ljudulpinjam.setFont(new java.awt.Font("Helvetica", 0, 20));
        
        background.setBackground(Color.DARK_GRAY);
        panel1.setBackground(Color.ORANGE);
        panel2.setBackground(Color.ORANGE);
        panel3.setBackground(Color.ORANGE);
        
        background.setBounds(0,0,800,650);
        panel1.setBounds(0,0,800,120);
        panel2.setBounds(590,130,210,800);
        panel3.setBounds(0,130,580,800);
        
        btnhome.setBounds(50,80,100,30);
        btnpinjam.setBounds(50,150,100,30);
        btndata.setBounds(50,220,100,30);
        btnabout.setBounds(50,290,100,30);
        btnlogout.setBounds(50,360,100,30);

        ljudul.setBounds(330,45,200,50);
        lidmember.setBounds(80,150,150,20);
        lnama.setBounds(80,190,150,20);
        lidbuku.setBounds(80,230,150,20);
        ljudulbuku.setBounds(80,270,150,20);
        tfidmember.setBounds(240,150,200,20);
        tfnama.setBounds(240,190,200,20);
        tfidbuku.setBounds(240,230,200,20);
        tfjudulbuku.setBounds(240,270,200,20);
        btnadd.setBounds(150,330,100,30);
        btnreset.setBounds(260,330,100,30);
        
    }
}
