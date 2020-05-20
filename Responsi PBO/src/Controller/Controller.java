
package Controller;

import Model.Model;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author M.S.I
 */
public class Controller {
    String id,idmember,nama,idbuku,judulbuku;
    public Controller(Model model, ViewLogin viewlogin,ViewHome viewhome, ViewPinjam viewpinjam,ViewData viewdata,ViewAbout viewabout,ViewEdit viewedit) {
        
        //MENGISI TAMPILAN BUKU 
        if (model.getPinjamBuku()!= 0) {
             // menampilkan tabel di awal
            String datapinjam[][] = model.readPinjamBuku();
            viewdata.tabel.setModel((new JTable(datapinjam, viewdata.namaKolom)).getModel());
            viewdata.tabel.getColumnModel().getColumn(4).setMinWidth(0);
            viewdata.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
         }
        
            //LOGIN USER
            viewlogin.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //cek login 
                String username = viewlogin.tfUsername.getText();
                String password = viewlogin.tfPass.getText();
                 if(viewlogin.tfUsername.getText().length() > 0 && viewlogin.tfPass.getText().length() >0 && model.checkLogin(username, password) == 1) {
                    viewlogin.setVisible(false);
                    viewhome.setVisible(true);
                    viewlogin.tfUsername.setText(null);
                    viewlogin.tfPass.setText(null);
                }
                 else { 
                     JOptionPane.showMessageDialog(null, "Username atau Password Salah");
                 }
            }
        });
            
            //EXIT
            viewlogin.btnExit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            
            //TAMPILAN AWAL
            viewhome.btnhome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewhome.setVisible(true);
                }
            });
            viewhome.btnpinjam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewhome.setVisible(false);
                    viewpinjam.setVisible(true);
                }
            });
            viewhome.btndata.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewhome.setVisible(false);
                    viewdata.setVisible(true);
                }
            });
            viewhome.btnabout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewhome.setVisible(false);
                    viewabout.setVisible(true);
                }
            });
            viewhome.btnlogout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Berhasil Logout");
                    viewhome.setVisible(false);
                    viewlogin.setVisible(true);
                }
            });
            
        //PINJAM BUKU    
            //PINJAM BUKU PANEL 2
           viewpinjam.btnhome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewhome.setVisible(true);
                    viewpinjam.setVisible(false);
                }
            });
            viewpinjam.btnpinjam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewpinjam.setVisible(true);
                }
            });
            viewpinjam.btndata.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewpinjam.setVisible(false);
                    viewdata.setVisible(true);
                }
            });
            viewpinjam.btnabout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewpinjam.setVisible(false);
                    viewabout.setVisible(true);
                }
            });
            
            //PINJAM BUKU PANEL 3
            viewpinjam.btnadd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String idmember = viewpinjam.tfidmember.getText();
                    String nama = viewpinjam.tfnama.getText();
                    String idbuku = viewpinjam.tfidbuku.getText();
                    String judulbuku = viewpinjam.tfjudulbuku.getText();
                    model.tambahPinjamBuku(idmember, nama, idbuku, judulbuku);
                    
                    String pinjam[][] = model.readPinjamBuku();
                    viewdata.tabel.setModel(new JTable(pinjam,viewdata.namaKolom).getModel());
                    viewdata.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                    viewdata.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                    viewpinjam.tfidmember.setText(null);
                    viewpinjam.tfnama.setText(null);
                    viewpinjam.tfidbuku.setText(null);
                    viewpinjam.tfjudulbuku.setText(null);
                    viewpinjam.setVisible(false);
                    viewdata.setVisible(true);
                }
            });
            
            viewpinjam.btnreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.tfidmember.setText(null);
                viewpinjam.tfnama.setText(null);
                viewpinjam.tfidbuku.setText(null);
                viewpinjam.tfjudulbuku.setText(null);
            }
        });
            
        //VIEW TAMPIL BUKU
            // VIEW TAMPIL PANEL 2
            viewdata.btnhome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewdata.setVisible(false);
                    viewhome.setVisible(true);
                }
            });
            viewdata.btnpinjam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewdata.setVisible(false);
                    viewpinjam.setVisible(true);
                }
            });
            viewdata.btndata.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewdata.setVisible(true);
                }
            });
            viewdata.btnabout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewdata.setVisible(false);
                    viewabout.setVisible(true);
                }
            });
            viewdata.btnlogout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Berhasil Logout");
                    viewdata.setVisible(false);
                    viewlogin.setVisible(true);
                }
            });
            
            //VIEW TAMPIL PANEL 3
            viewdata.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewdata.tabel.getSelectedRow();
                int kolom = viewdata.tabel.getSelectedColumn();

                String dataterpilih = viewdata.tabel.getValueAt(baris, 0).toString();
                
                idmember = viewdata.tabel.getValueAt(baris, 0).toString();
                nama = viewdata.tabel.getValueAt(baris, 1).toString();
                idbuku = viewdata.tabel.getValueAt(baris, 2).toString();
                judulbuku = viewdata.tabel.getValueAt(baris, 3).toString();
                id = viewdata.tabel.getValueAt(baris, 4).toString();
                
                viewdata.btnedit.setEnabled(true);
                viewdata.btnhapus.setEnabled(true);
  
            }
           });
            
           viewdata.btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.id.setText(id);
                viewedit.tfidmember.setText(idmember);
                viewedit.tfnama.setText(nama);
                viewedit.tfidbuku.setText(idbuku);
                viewedit.tfjudulbuku.setText(judulbuku);
                viewdata.setVisible(false);
                viewedit.setVisible(true);
            }
        });
           
           viewdata.btnhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            int input =JOptionPane.showConfirmDialog(null, "apakah anda ingin Hapus Pinjam Buku ini ? ","Pilih opsi" , JOptionPane.YES_NO_OPTION);
            
            if (input == 0) { 
                    model.hapusPinjamBuku(id);
                    String datakontak[][] = model.readPinjamBuku();
                    viewdata.tabel.setModel((new JTable(datakontak, viewdata.namaKolom)).getModel());
                    viewdata.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                    viewdata.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                    viewdata.btnhapus.setEnabled(false);
                    viewdata.btnedit.setEnabled(false);
            }
            else { 
                JOptionPane.showMessageDialog(null, "Tidak jadi Hapus");
            }
                        
            }
        });
           
         //VIEW ABOUT
            //VIEW ABOUT PANEL 2
             viewabout.btnhome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewabout.setVisible(false);
                    viewhome.setVisible(true);
                }
            });
            viewabout.btnpinjam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewabout.setVisible(false);
                    viewpinjam.setVisible(true);
                }
            });
            viewabout.btndata.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewdata.setVisible(true);
                    viewabout.setVisible(false);
                }
            });
            viewabout.btnabout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    viewabout.setVisible(true);
                }
            });
            viewabout.btnlogout.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Berhasil Logout");
                    viewabout.setVisible(false);
                    viewlogin.setVisible(true);
                }
            });
            
        //VIEW EDIT
            viewedit.btnedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String idA = viewedit.tfidmember.getText();
                 String namaA = viewedit.tfnama.getText();
                 String idB = viewedit.tfidbuku.getText();
                 String judulB = viewedit.tfjudulbuku.getText();
                 
                 model.updatePinjamBuku(id, namaA, idB, judulB);
                 String contact[][] = model.readPinjamBuku();
                 viewdata.tabel.setModel(new JTable(contact,viewdata.namaKolom).getModel());
                 viewdata.tabel.getColumnModel().getColumn(4).setMinWidth(0);
                 viewdata.tabel.getColumnModel().getColumn(4).setMaxWidth(0);
                 viewdata.btnhapus.setEnabled(false);
                 viewdata.btnedit.setEnabled(false);
                 viewedit.setVisible(false);
                 viewdata.setVisible(true);
                 
            }
        });
        
            viewedit.btnbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                viewdata.setVisible(true);
                viewdata.btnhapus.setEnabled(false);
                viewdata.btnedit.setEnabled(false);
            }
        });
    }
}
