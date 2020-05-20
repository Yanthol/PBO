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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M.S.I
 */
public class ViewData extends JFrame{
    public JLabel ljudul = new JLabel("Library");
    public JLabel ljuduldata = new JLabel("Tampil Pinjaman Buku");
    public JPanel background = new JPanel();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();
    public JButton btnhome = new JButton("Home");
    public JButton btnpinjam = new JButton("Pinjam");
    public JButton btndata = new JButton("Data");
    public JButton btnabout = new JButton("About us");
    public JButton btnlogout = new JButton("Logout");
    public JButton btnhapus = new JButton("Hapus");
    public JButton btnedit = new JButton("Edit");
    public Font fjudul= new Font("Calibri", Font.BOLD + Font.ITALIC, 40) ;
    
    //TABEL
    public JTable tabel ;
    public DefaultTableModel tabelModel;
    public JScrollPane scrollPane; 
    public Object namaKolom [] =  {"id","no_hp","id_buku","judul",""} ; 
    
    public ViewData () {
        background.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        setVisible(false);
        setSize(800,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Data Peminjaman");
        
        tabelModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tabelModel);    
        scrollPane = new JScrollPane(tabel);
        
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
        panel3.add(ljuduldata);
        panel3.add(scrollPane);
        panel3.add(btnhapus);
        panel3.add(btnedit);
        
        ljudul.setFont(fjudul);
        ljuduldata.setFont(new java.awt.Font("Helvetica", 0, 18));
        
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
        btnedit.setBounds(180,100,100,25);
        btnhapus.setBounds(300,100,100,25);
        scrollPane.setBounds(20,150,530,360);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        btnedit.setEnabled(false);
        btnhapus.setEnabled(false);
        
    }
}
