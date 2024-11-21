/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;
/**
 *
 * @author khali
 */
public class Anggota extends Mahasiswa {
    private final String role = "Anggota";

    public Anggota(String nim, String name, String password) {
        super(nim, name, password);
    }

    @Override
    public final String getRole(){
        return this.role;
    }

    public static final boolean loginAnggota(String nim, String password) {
        try {
            // Pastikan koneksi database terhubung
            if (Database.connect() == null) {
                JOptionPane.showMessageDialog(null, "Koneksi ke database gagal!");
                return false;
            }

            String query = "SELECT * FROM Anggota WHERE nim = ? AND password = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, nim);
            Database.preparedStatement.setString(2, password);
            Database.resultSet = Database.preparedStatement.executeQuery();

            if (Database.resultSet.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Login Gagal!" + e.getMessage());
        }
        return false;
    }
}
