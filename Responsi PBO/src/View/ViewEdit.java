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
public class ViewEdit extends JFrame {
    public JLabel ljudul = new JLabel("Library");
    public JLabel ljudulpinjam = new JLabel("Pinjam Buku");
    public JLabel lidmember = new JLabel("ID anggota  :");
    public JLabel lnama = new JLabel("Nama Anggota  :");
    public JLabel lidbuku = new JLabel("ID Buku  :");
    public JLabel ljudulbuku = new JLabel("Judul Buku  :");
    public JTextField tfidmember = new JTextField();
    public JTextField tfnama = new JTextField();
    public JTextField tfidbuku = new JTextField();
    public JTextField tfjudulbuku = new JTextField();
    public JTextField id = new JTextField();
    public JButton btnedit = new JButton("Edit");
    public JButton btnbatal = new JButton("Cancel");
    public JPanel background = new JPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public Font fjudul= new Font("Calibri", Font.BOLD + Font.ITALIC, 40) ;
    
    public ViewEdit () {
        background.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        tfidmember.setEnabled(false);
        setVisible(false);
        setSize(525,475);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Edit Data Peminjaman");
        
        add(background);
        background.add(ljudul);
        background.add(lidmember);
        background.add(lnama);
        background.add(lidbuku);
        background.add(ljudulbuku);
        background.add(tfidmember);
        background.add(tfnama);
        background.add(tfidbuku);
        background.add(tfjudulbuku);
        background.add(btnedit);
        background.add(btnbatal);
        
        ljudul.setFont(fjudul);
        lidmember.setFont(new java.awt.Font("Helvetica", 0, 18));
        lidbuku.setFont(new java.awt.Font("Helvetica", 0, 18));
        ljudulbuku.setFont(new java.awt.Font("Helvetica", 0, 18));
        lnama.setFont(new java.awt.Font("Helvetica", 0, 18));
        
        background.setBackground(Color.ORANGE);
        
        background.setBounds(0,0,800,650);
        
        ljudul.setBounds(330,45,200,50);
        lidmember.setBounds(80,150,150,20);
        lnama.setBounds(80,190,150,20);
        lidbuku.setBounds(80,230,150,20);
        ljudulbuku.setBounds(80,270,150,20);
        tfidmember.setBounds(240,150,200,20);
        tfnama.setBounds(240,190,200,20);
        tfidbuku.setBounds(240,230,200,20);
        tfjudulbuku.setBounds(240,270,200,20);
        btnedit.setBounds(150,330,100,20);
        btnbatal.setBounds(260,330,100,20);
        
    }
}
