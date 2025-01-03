/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.*;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author yasmi
 */
public class formCRUDadmin extends javax.swing.JFrame {

    /**
     * Creates new form CRUDadmin
     */
    public formCRUDadmin() {
        initComponents();
        addTableClickListener();
        Database.connect();
        table();
    }
    
private void addTableClickListener() {
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int row = jTable1.getSelectedRow(); // Baris yang dipilih
            
            if (row != -1) {
                String id_tugas = jTable1.getValueAt(row, 0).toString();
                String nama_matkul = jTable1.getValueAt(row, 1).toString();
                String nama_tugas = jTable1.getValueAt(row, 2).toString();
                String deskripsi_tugas = jTable1.getValueAt(row, 3).toString();
                String tenggat_waktu = jTable1.getValueAt(row, 4).toString(); // Ambil nilai tanggal (String)
                String skala_prioritas = jTable1.getValueAt(row, 5).toString();
                String status_tugas = jTable1.getValueAt(row, 6).toString();

                cbNamamatkul.setSelectedItem(nama_matkul);
                txtNamatugas.setText(nama_tugas);
                txtDeskripsi.setText(deskripsi_tugas);
                
                try {
                    // Konversi String tanggal ke Date menggunakan format yang sama
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = sdf.parse(tenggat_waktu); // Konversi String ke Date
                    txtTenggat.setDate(date); // Set tanggal ke JDateChooser
                } catch (ParseException e) {
                    e.printStackTrace(); // Tampilkan error jika format tanggal tidak sesuai
                }

                cbSkala.setSelectedItem(skala_prioritas);
            }
        }
    });
}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        cbNamamatkul = new javax.swing.JComboBox<>();
        cbSkala = new javax.swing.JComboBox<>();
        cbPengurutan = new javax.swing.JComboBox<>();
        txtNamatugas = new javax.swing.JTextField();
        txtCariItugas = new javax.swing.JTextField();
        txtTenggat = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCaritugas = new javax.swing.JButton();
        btnBuattugas = new javax.swing.JButton();
        btnHapustugas = new javax.swing.JButton();
        btnEdittugas = new javax.swing.JButton();
        btnLihattugas = new javax.swing.JButton();
        btnUrut = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnKeluarCRUD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDeskripsi.setBackground(new java.awt.Color(100, 90, 65));
        txtDeskripsi.setColumns(20);
        txtDeskripsi.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtDeskripsi.setForeground(new java.awt.Color(255, 249, 234));
        txtDeskripsi.setLineWrap(true);
        txtDeskripsi.setRows(5);
        txtDeskripsi.setBorder(null);
        jScrollPane2.setViewportView(txtDeskripsi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 320, 170));

        cbNamamatkul.setBackground(new java.awt.Color(100, 90, 65));
        cbNamamatkul.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        cbNamamatkul.setForeground(new java.awt.Color(255, 255, 255));
        cbNamamatkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Mata Kuliah", "Pemrograman Berbasis Objek", "Desain Manajemen Jaringan Komputer", "Desain Manajemen Proses Bisnis", "Riset Operasi", "Interaksi Manusia dan Komputer", "Desain Basis Data", "Dasar-Dasar Pengembangan Perangkat Lunak" }));
        cbNamamatkul.setBorder(null);
        cbNamamatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNamamatkulActionPerformed(evt);
            }
        });
        getContentPane().add(cbNamamatkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 300, 40));

        cbSkala.setBackground(new java.awt.Color(100, 90, 65));
        cbSkala.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        cbSkala.setForeground(new java.awt.Color(255, 255, 255));
        cbSkala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 (rendah)", "2 (sedang)", "3 (tinggi)" }));
        cbSkala.setBorder(null);
        cbSkala.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbSkala.setMinimumSize(new java.awt.Dimension(418, 29));
        cbSkala.setPreferredSize(new java.awt.Dimension(418, 29));
        cbSkala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSkalaActionPerformed(evt);
            }
        });
        getContentPane().add(cbSkala, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 300, 40));

        cbPengurutan.setBackground(new java.awt.Color(100, 90, 65));
        cbPengurutan.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        cbPengurutan.setForeground(new java.awt.Color(255, 255, 255));
        cbPengurutan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Skala Prioritas Tinggi ke Rendah", "Skala Prioritas Rendah ke Tinggi", "Nama Tugas A-Z", "Nama Tugas Z-A" }));
        cbPengurutan.setBorder(null);
        cbPengurutan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbPengurutan.setMinimumSize(new java.awt.Dimension(418, 29));
        cbPengurutan.setPreferredSize(new java.awt.Dimension(418, 29));
        cbPengurutan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPengurutanActionPerformed(evt);
            }
        });
        getContentPane().add(cbPengurutan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 300, 40));

        txtNamatugas.setBackground(new java.awt.Color(100, 90, 65));
        txtNamatugas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNamatugas.setForeground(new java.awt.Color(255, 249, 234));
        txtNamatugas.setBorder(null);
        getContentPane().add(txtNamatugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 270, 30));

        txtCariItugas.setBackground(new java.awt.Color(100, 90, 65));
        txtCariItugas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtCariItugas.setForeground(new java.awt.Color(255, 249, 234));
        txtCariItugas.setText("Masukkan ID atau Nama Tugas");
        txtCariItugas.setBorder(null);
        txtCariItugas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCariItugasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCariItugasFocusLost(evt);
            }
        });
        txtCariItugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariItugasActionPerformed(evt);
            }
        });
        getContentPane().add(txtCariItugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 280, 30));

        txtTenggat.setForeground(new java.awt.Color(100, 90, 65));
        txtTenggat.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(txtTenggat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 300, 50));

        jTable1.setBackground(new java.awt.Color(228, 198, 122));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama Mata Kuliah", "Nama Tugas", "Deskripsi Tugas", "Tenggat Waktu", "Skala Prioritas", "Status Tugas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 950, 180));

        btnCaritugas.setBackground(new java.awt.Color(228, 198, 122));
        btnCaritugas.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCaritugas.setForeground(new java.awt.Color(100, 90, 65));
        btnCaritugas.setBorder(null);
        btnCaritugas.setBorderPainted(false);
        btnCaritugas.setContentAreaFilled(false);
        btnCaritugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaritugasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCaritugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 140, 40));

        btnBuattugas.setBackground(new java.awt.Color(228, 198, 122));
        btnBuattugas.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnBuattugas.setForeground(new java.awt.Color(100, 90, 65));
        btnBuattugas.setBorder(null);
        btnBuattugas.setBorderPainted(false);
        btnBuattugas.setContentAreaFilled(false);
        btnBuattugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuattugasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuattugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, 130, 40));

        btnHapustugas.setBackground(new java.awt.Color(228, 198, 122));
        btnHapustugas.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnHapustugas.setForeground(new java.awt.Color(100, 90, 65));
        btnHapustugas.setBorder(null);
        btnHapustugas.setBorderPainted(false);
        btnHapustugas.setContentAreaFilled(false);
        btnHapustugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapustugasActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapustugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 190, 130, 40));

        btnEdittugas.setBackground(new java.awt.Color(228, 198, 122));
        btnEdittugas.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEdittugas.setForeground(new java.awt.Color(100, 90, 65));
        btnEdittugas.setBorder(null);
        btnEdittugas.setBorderPainted(false);
        btnEdittugas.setContentAreaFilled(false);
        btnEdittugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdittugasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdittugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 260, 130, 30));

        btnLihattugas.setBackground(new java.awt.Color(228, 198, 122));
        btnLihattugas.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnLihattugas.setForeground(new java.awt.Color(100, 90, 65));
        btnLihattugas.setBorder(null);
        btnLihattugas.setBorderPainted(false);
        btnLihattugas.setContentAreaFilled(false);
        btnLihattugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihattugasActionPerformed(evt);
            }
        });
        getContentPane().add(btnLihattugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 320, 130, 40));

        btnUrut.setBackground(new java.awt.Color(228, 198, 122));
        btnUrut.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnUrut.setForeground(new java.awt.Color(100, 90, 65));
        btnUrut.setBorder(null);
        btnUrut.setBorderPainted(false);
        btnUrut.setContentAreaFilled(false);
        btnUrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrutActionPerformed(evt);
            }
        });
        getContentPane().add(btnUrut, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 130, 50));

        btnRefresh.setBackground(new java.awt.Color(228, 198, 122));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(100, 90, 65));
        btnRefresh.setBorder(null);
        btnRefresh.setBorderPainted(false);
        btnRefresh.setContentAreaFilled(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 120, 40));

        btnKeluarCRUD.setBackground(new java.awt.Color(228, 198, 122));
        btnKeluarCRUD.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnKeluarCRUD.setForeground(new java.awt.Color(100, 90, 65));
        btnKeluarCRUD.setBorder(null);
        btnKeluarCRUD.setBorderPainted(false);
        btnKeluarCRUD.setContentAreaFilled(false);
        btnKeluarCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarCRUDMouseClicked(evt);
            }
        });
        btnKeluarCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarCRUDActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluarCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LOGIN (19).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void table(){
        DefaultTableModel model = new DefaultTableModel(){
          @Override
          public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.addColumn("ID Tugas");
        model.addColumn("Nama Mata Kuliah");
        model.addColumn("Nama Tugas");
        model.addColumn("Deskripsi Tugas");
        model.addColumn("Tenggat Waktu");
        model.addColumn("Skala Prioritas");
        model.addColumn("Status Tugas");
        
        try {
            Statement statement = Database.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tugas");
            
            while (resultSet.next()) {
                model.addRow(new Object[] {
                    resultSet.getString("id_tugas"),
                    resultSet.getString("nama_matkul"),
                    resultSet.getString("nama_tugas"),
                    resultSet.getString("deskripsi_tugas"),
                    resultSet.getString("tenggat_waktu"),
                    resultSet.getString("skala_prioritas"),
                    resultSet.getString("status_tugas")
                });
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            e.printStackTrace();
        }
    }
    
    void clear() {
        txtNamatugas.setText("");
        txtTenggat.setDate(null);
        txtDeskripsi.setText("");
        cbSkala.setSelectedIndex(0);
        cbPengurutan.setSelectedIndex(0);
        cbNamamatkul.setSelectedIndex(0);
    }
    
    private void cbNamamatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNamamatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNamamatkulActionPerformed

    private void btnLihattugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihattugasActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel(new String[]{
                "ID Tugas", "Mata Kuliah", "Nama Tugas", "Deskripsi Tugas", "Tenggat Waktu", "Skala Prioritas", "Status"
            }, 0);

            jTable1.setModel(model);
            String selectedMatkul = cbNamamatkul.getSelectedItem().toString(); // Ambil pilihan dari ComboBox
            
            String query;
        if (selectedMatkul.equals("Semua Mata Kuliah")) {
            // Query untuk menampilkan semua data
            query = "SELECT * FROM tugas";
            Database.preparedStatement = Database.connection.prepareStatement(query);
        } else {
            // Query untuk menampilkan data berdasarkan mata kuliah tertentu
            query = "SELECT * FROM tugas WHERE nama_matkul = ?";
            Database.preparedStatement = Database.connection.prepareStatement(query);
            Database.preparedStatement.setString(1, selectedMatkul);
        }

        Database.resultSet = Database.preparedStatement.executeQuery();
        
        
        // Tambahkan data hasil query ke JTable
        while (Database.resultSet.next()) {
            Object[] row = new Object[]{
                Database.resultSet.getInt("id_tugas"),
                Database.resultSet.getString("nama_matkul"),
                Database.resultSet.getString("nama_tugas"),
                Database.resultSet.getString("deskripsi_tugas"),
                Database.resultSet.getString("tenggat_waktu"),
                Database.resultSet.getString("skala_prioritas"),
                Database.resultSet.getString("status_tugas")
            };
            model.addRow(row);
        }

        // Jika tidak ada data ditemukan
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Tidak ada data yang ditemukan.");
        }
            
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengambil data.");
        e.printStackTrace();
        }      // TODO add your handling code here:
    }//GEN-LAST:event_btnLihattugasActionPerformed

    private void btnKeluarCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarCRUDMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnKeluarCRUDMouseClicked

    private void btnKeluarCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarCRUDActionPerformed
        formLogin formLogin1 = new formLogin();
        formLogin1.setVisible(true);  
        this.dispose();
    }//GEN-LAST:event_btnKeluarCRUDActionPerformed

    private void btnBuattugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuattugasActionPerformed
        try {
            String nama_matkul = cbNamamatkul.getSelectedItem().toString();
            String nama_tugas = txtNamatugas.getText();
            String deskripsi_tugas = txtDeskripsi.getText();
            String skala_prioritas = cbSkala.getSelectedItem().toString();

            // Periksa apakah pengguna memilih "Semua Mata Kuliah"
            if (nama_matkul.equals("Semua Mata Kuliah")) {
                JOptionPane.showMessageDialog(null, "Silakan pilih salah satu Mata Kuliah");
                return;
            }
        
            // Ambil nilai tanggal dari JDateChooser
            Date selectedDate = txtTenggat.getDate();
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(null, "Tolong pilih tanggal tenggat waktu");
                return;
            }

            // Konversi tanggal dari Date ke LocalDate
            LocalDate tenggatWaktu = selectedDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

            // Ambil tanggal saat ini
            LocalDate currentDate = LocalDate.now();

            // Tentukan status tugas berdasarkan perbandingan tanggal
            String status_tugas = tenggatWaktu.isAfter(currentDate) || tenggatWaktu.isEqual(currentDate)
                ? "Aktif"
                : "Tidak Aktif";

            // Format tanggal ke format yang diinginkan (dd/MM/yyyy)
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String tenggat_waktu = sdf.format(selectedDate);

            // Validasi input
            if (nama_matkul.equals("Pilih Nama Mata Kuliah") || nama_tugas.equals("") || deskripsi_tugas.equals("") || skala_prioritas.equals("Pilih Skala Prioritas")) {
                JOptionPane.showMessageDialog(null, "Tolong isi semua kolom");
            } else if (nama_tugas.length() > 100) {
                JOptionPane.showMessageDialog(null, "Nama tugas tidak boleh lebih dari 100 karakter");
            } else {
                // Simpan tugas ke database
                Tugas tugas = new Tugas(null, nama_matkul, nama_tugas, deskripsi_tugas, tenggat_waktu, skala_prioritas, status_tugas);
                tugas.createTugas();
                JOptionPane.showMessageDialog(null, "Tugas berhasil ditambahkan\nStatus: " + status_tugas);
                clear();
                table();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuattugasActionPerformed

    private void btnHapustugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapustugasActionPerformed
        try {
            int row = jTable1.getSelectedRow();
            
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Silahkan pilih baris yang akan dihapus");
            } else {
                // Konfirmasi penghapusan
                int confirm = JOptionPane.showConfirmDialog(null, 
                    "Apakah Anda yakin ingin menghapus tugas ini?", 
                    "Konfirmasi Hapus", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.WARNING_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                    // Hapus tugas jika pengguna memilih "Yes"
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    int id_tugas = Integer.parseInt(jTable1.getValueAt(row, 0).toString());

                    // Lakukan penghapusan di database
                    Tugas tugas = new Tugas(id_tugas, "", "", "", "", "", "");
                    tugas.deleteTugas();

                    // Hapus baris dari tabel
                    model.removeRow(row);

                    JOptionPane.showMessageDialog(null, "Tugas berhasil dihapus");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHapustugasActionPerformed

    private void btnEdittugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdittugasActionPerformed
        try {
        int row = jTable1.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Silakan pilih baris yang akan diubah");
        } else {
            int id_tugas = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
            String nama_matkul = cbNamamatkul.getSelectedItem().toString();
            String nama_tugas = txtNamatugas.getText();
            String deskripsi_tugas = txtDeskripsi.getText();
            String skala_prioritas = cbSkala.getSelectedItem().toString();

            // Periksa apakah pengguna memilih "Semua Mata Kuliah"
            if (nama_matkul.equals("Semua Mata Kuliah")) {
                JOptionPane.showMessageDialog(null, "Silakan pilih salah satu Mata Kuliah, bukan 'Semua Mata Kuliah'");
                return;
            }

            // Ambil nilai tanggal dari JDateChooser
            Date selectedDate = txtTenggat.getDate();
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(null, "Tolong pilih tanggal tenggat waktu");
                return;
            }

            // Konversi tanggal dari Date ke LocalDate
            LocalDate tenggatWaktu = selectedDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

            // Ambil tanggal saat ini
            LocalDate currentDate = LocalDate.now();

            // Tentukan status tugas berdasarkan perbandingan tanggal
            String status_tugas = tenggatWaktu.isAfter(currentDate) || tenggatWaktu.isEqual(currentDate)
                ? "Aktif"
                : "Tidak Aktif";

            // Format tanggal ke format yang diinginkan (dd/MM/yyyy)
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String tenggat_waktu = sdf.format(selectedDate);

            if (nama_matkul.equals("Pilih Nama Mata Kuliah") || nama_tugas.equals("") || deskripsi_tugas.equals("") || skala_prioritas.equals("Pilih Skala Prioritas")) {
                JOptionPane.showMessageDialog(null, "Tolong isi semua kolom");
            } else if (nama_tugas.length() > 100) {
                JOptionPane.showMessageDialog(null, "Nama tugas tidak boleh lebih dari 100 karakter");
            } else {
                // Tambahkan dialog konfirmasi sebelum update
                int confirm = JOptionPane.showConfirmDialog(null, 
                    "Apakah Anda yakin ingin mengedit tugas ini?", 
                    "Konfirmasi Edit", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                    // Lakukan proses update jika pengguna memilih "Yes"
                    Tugas tugas = new Tugas(id_tugas, nama_matkul, nama_tugas, deskripsi_tugas, tenggat_waktu, skala_prioritas, status_tugas);
                    tugas.updateTugas();
                    JOptionPane.showMessageDialog(null, "Tugas berhasil diubah");
                    clear();
                    table();
                }
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnEdittugasActionPerformed

    private void btnCaritugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaritugasActionPerformed
        try {
            String id_tugas = txtCariItugas.getText();
            
            if  (id_tugas != null && !id_tugas.isEmpty()) {
                Database.connect();
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ID Tugas");
                model.addColumn("Nama Mata Kuliah");
                model.addColumn("Nama Tugas");
                model.addColumn("Deskripsi Tugas");
                model.addColumn("Tenggat Waktu");
                model.addColumn("Skala Prioritas");
                model.addColumn("Status Tugas");
                
                try {
                    Statement statement = Database.connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(
                        "SELECT * FROM tugas WHERE id_tugas = '" + id_tugas + "' OR nama_tugas LIKE '%" + id_tugas + "%'"
                    );

                    // Tambahkan baris ke model tabel
                    boolean found = false; // Menandai jika ada hasil
                    while (resultSet.next()) {
                        found = true;
                        model.addRow(new Object[] {
                            resultSet.getString("id_tugas"),
                            resultSet.getString("nama_matkul"),
                            resultSet.getString("nama_tugas"),
                            resultSet.getString("deskripsi_tugas"),
                            resultSet.getString("tenggat_waktu"),
                            resultSet.getString("skala_prioritas"),
                            resultSet.getString("status_tugas")
                        });
                    }
                    
                    jTable1.setModel(model);
                    
                    // Jika tidak ditemukan, tampilkan pesan
                    if (!found) {
                        JOptionPane.showMessageDialog(null, "ID Tugas tidak ditemukan");
                    }
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada Pencarian");
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Silakan masukkan ID Tugas yang ingin dicari");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCaritugasActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
         table();
         clear();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void cbPengurutanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPengurutanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPengurutanActionPerformed

    private void btnUrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrutActionPerformed
        try {
            String sorting = cbPengurutan.getSelectedItem().toString();
            Database.connect();
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Tugas");
            model.addColumn("Nama Mata Kuliah");
            model.addColumn("Nama Tugas");
            model.addColumn("Deskripsi Tugas");
            model.addColumn("Tenggat Waktu");
            model.addColumn("Skala Prioritas");
            model.addColumn("Status Tugas");
            
            try {
                Statement statement = Database.connection.createStatement();
                
                String query = "SELECT * FROM tugas ORDER BY ";
                if (sorting.equals("Skala Prioritas Tinggi ke Rendah")) {
                    query += "skala_prioritas ASC";
                } else if (sorting.equals("Skala Prioritas Rendah ke Tinggi")) {
                    query += "skala_prioritas DESC";
                } else if (sorting.equals("Nama Tugas A-Z")) {
                    query += "nama_tugas ASC";
                } else if (sorting.equals("Nama Tugas Z-A")) {
                    query += "nama_tugas DESC";
                }
                
                ResultSet resultSet = statement.executeQuery(query);
                
                while (resultSet.next()) {
                    model.addRow(new Object[] {
                        resultSet.getString("id_tugas"),
                        resultSet.getString("nama_matkul"),
                        resultSet.getString("nama_tugas"),
                        resultSet.getString("deskripsi_tugas"),
                        resultSet.getString("tenggat_waktu"),
                        resultSet.getString("skala_prioritas"),
                        resultSet.getString("status_tugas")
                    });
                    jTable1.setModel(model);
                }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            e.printStackTrace();
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUrutActionPerformed

    private void cbSkalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSkalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSkalaActionPerformed

    private void txtCariItugasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariItugasFocusGained
        if (txtCariItugas.getText().equals("Masukkan ID atau Nama Tugas")) {
            txtCariItugas.setText("");
        }
    }//GEN-LAST:event_txtCariItugasFocusGained

    private void txtCariItugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariItugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariItugasActionPerformed

    private void txtCariItugasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCariItugasFocusLost
        if (txtCariItugas.getText().isEmpty()){
            txtCariItugas.setText("Masukkan ID atau Nama Tugas");
        }
    }//GEN-LAST:event_txtCariItugasFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formCRUDadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCRUDadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCRUDadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCRUDadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCRUDadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuattugas;
    private javax.swing.JButton btnCaritugas;
    private javax.swing.JButton btnEdittugas;
    private javax.swing.JButton btnHapustugas;
    private javax.swing.JButton btnKeluarCRUD;
    private javax.swing.JButton btnLihattugas;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUrut;
    private javax.swing.JComboBox<String> cbNamamatkul;
    private javax.swing.JComboBox<String> cbPengurutan;
    private javax.swing.JComboBox<String> cbSkala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCariItugas;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JTextField txtNamatugas;
    private com.toedter.calendar.JDateChooser txtTenggat;
    // End of variables declaration//GEN-END:variables
}
