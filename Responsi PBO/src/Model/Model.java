
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author M.S.I
 */
public class Model {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pbo_prak_responsi";
    static final String USER = "root";
    static final String PASS = ""; 
    
    Connection koneksi;
    Statement statement;
    
    public Model() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Success");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Connection Error");  
        }
    }
      
    public int checkLogin (String username , String password) { 
        int user=0 ;
        try {
            String query = "SELECT * FROM admin WHERE username='" + username + "' AND password='"+password+"' ";
            statement = (Statement) koneksi.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                user++;
            }
            if (user==1)
            JOptionPane.showMessageDialog(null, "Berhasil Login!");
            return user ;
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return 0 ;
        }
    }
    
      public int getPinjamBuku () {
         int jumlahData =0 ;
            try { 
                statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
                String query = "SELECT * FROM pinjam_buku ";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next() ) { 
                    jumlahData ++ ;
                }
                return jumlahData;
            }
            catch(SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("SQL Eror");
                return 0;
            }
    }
    
      public String[][] readPinjamBuku() {
            int jumlah = 0 ;
            try {
                String data[][] = new String [ getPinjamBuku()] [5];
                String query = "Select * FROM pinjam_buku";
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {
                    data[jumlah][0] = rs.getString("id_anggota");
                    data[jumlah][1] = rs.getString("nama_anggota");
                    data[jumlah][2] = rs.getString("id_buku");
                    data[jumlah][3] = rs.getString("judul_buku");
                    data[jumlah][4] = rs.getString("id");
                    jumlah++;
                }
                return data; 
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("SQL Eror");
                return null;
            }
    }
    
    public void tambahPinjamBuku (String idanggota, String namaanggota, String idbuku, String judulbuku) {
        try {
        String query = "INSERT INTO `pinjam_buku` (`id_anggota`,`nama_anggota`,`id_buku`,`judul_buku`) "
                + "VALUES ('" + idanggota + "','" + namaanggota + "','" + idbuku + "','" + judulbuku + "')";
        statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
        statement.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Pinjam Buku!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
        public void hapusPinjamBuku(String id) {
        try{
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
            String query = "DELETE FROM pinjam_buku WHERE `id` = '" +id+ "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di hapus");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Tidak ada data");
        }
    }
        
    public void updatePinjamBuku (String id,String namaanggota, String idbuku, String judulbuku){
        try{ 
            statement = (com.mysql.jdbc.Statement) koneksi.createStatement();
            String query = "UPDATE `pinjam_buku` SET `nama_anggota` ='"+namaanggota+"', `id_buku` ='"+idbuku+"', `judul_buku` ='"+judulbuku+"' WHERE `id` ='"+id+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Pinjam Buku Berhasil di update");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
