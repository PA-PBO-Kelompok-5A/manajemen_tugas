/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author khali
 */
public class Tugas {
    private final Integer id_tugas;
    private final String nama_matkul;
    private final String nama_tugas;
    private final String deskripsi_tugas;
    private final String tenggat_waktu;
    private final String skala_prioritas;
    private final String status_tugas;

    public Tugas(Integer id_tugas, String nama_matkul, String nama_tugas, String deskripsi_tugas, String tenggat_waktu, String skala_prioritas, String status_tugas) {
        this.id_tugas = id_tugas;
        this.nama_matkul = nama_matkul;
        this.nama_tugas = nama_tugas;
        this.deskripsi_tugas = deskripsi_tugas;
        this.tenggat_waktu = tenggat_waktu;
        this.skala_prioritas = skala_prioritas;
        this.status_tugas = status_tugas;
    }

    public final Integer getId_tugas() {
        return this.id_tugas;
    }
    
    public final String getNama_matkul() {
        return this.nama_matkul;
    }

    public final String getNama_tugas() {
        return this.nama_tugas;
    }

    public final String getDeskripsi_tugas() {
        return this.deskripsi_tugas;
    }

    public final String getTenggat_waktu() {
        return this.tenggat_waktu;
    }
    
    public final String getSkala_prioritas() {
        return this.skala_prioritas;
    }
    
    public final String getStatus_tugas(){
        return this.status_tugas;
    }

    public final void createTugas() {
        try {
            String query = "INSERT INTO tugas (nama_matkul, nama_tugas, deskripsi_tugas, tenggat_waktu, skala_prioritas, status_tugas) VALUES (?, ?, ?, ?, ?, ?)";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getNama_matkul());
            Database.preparedStatement.setString(2, this.getNama_tugas());
            Database.preparedStatement.setString(3, this.getDeskripsi_tugas());
            Database.preparedStatement.setString(4, this.getTenggat_waktu());
            Database.preparedStatement.setString(5, this.getSkala_prioritas());
            Database.preparedStatement.setString(6, this.getStatus_tugas());
            Database.preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Gagal menambah tugas!" + e.getMessage());
        }
    }

    public final void deleteTugas() {
        try {
            String query = "DELETE FROM tugas WHERE id_tugas = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setInt(1, this.getId_tugas());
            Database.preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Gagal menghapus data tugas!" + e.getMessage());
        }
    }

    public final void updateTugas() {
        try {
            String query = "UPDATE tugas SET nama_matkul = ?, nama_tugas = ?, deskripsi_tugas = ?, tenggat_waktu = ?, skala_prioritas = ?, status_tugas = ? WHERE id_tugas = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, this.getNama_matkul());
            Database.preparedStatement.setString(2, this.getNama_tugas());
            Database.preparedStatement.setString(3, this.getDeskripsi_tugas());
            Database.preparedStatement.setString(4, this.getTenggat_waktu());
            Database.preparedStatement.setString(5, this.getSkala_prioritas());
            Database.preparedStatement.setString(6, this.getStatus_tugas());
            Database.preparedStatement.setInt(7, this.getId_tugas());
            Database.preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Gagal mengupdate data tugas!" + e.getMessage());
        }
    }
}
