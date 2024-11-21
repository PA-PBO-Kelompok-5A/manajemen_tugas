# Sistem Manajemen Penjadwalan Tugas Kelas

"Sistem Manajemen Penjadwalan Tugas Kelas" merupakan aplikasi yang dikembangkan menggunakan bahasa pemrograman java dengan paradigma Pemrograman Berorientasi Objek (PBO). Aplikasi ini dirancang untuk memudahkan mahasiswa dalam mengelola dan melihat jadwal tugas yang ada dengan menyediakan antarmuka yang interaktif dan mudah digunakan.

#### Fitur Utama
- CRUD Tugas
- Sorting
- Filter
- Searching

## Flowchart
#### Menu Login
![image](https://github.com/user-attachments/assets/cc672883-4e17-43b6-b31d-4d989cf45f7e)
#### Menu PJ
![image](https://github.com/user-attachments/assets/2ee618ea-34a9-49ba-8c27-9c51914c1098)
#### Menu Anggota
![image](https://github.com/user-attachments/assets/cc1ccec2-1079-4edd-9418-ff07aec6ce16)

## ERD
#### ERD Logical
![logicaltugas](https://github.com/user-attachments/assets/d98e7a55-db56-4dfe-9807-842489aec6ec)
#### ERD Relational
![relationaltugas](https://github.com/user-attachments/assets/112c4bce-2406-4f3d-beb8-0e5bbb384030)

##### Entitas
PJ (Penanggung Jawab)
  - Atribut:
    - NIM: Nomor Induk Mahasiswa, sebagai identifikasi unik.
    - Nama: Nama penanggung jawab.
    - Password: Kata sandi untuk autentikasi.
    - No_telepon: Nomor telepon untuk kontak.
  - Hubungan:
    - Mengakses: PJ dapat mengakses tugas yang ada dalam sistem.

Anggota
  - Atribut:
    - NIM: Nomor Induk Mahasiswa, sebagai identifikasi unik.
    - Nama: Nama anggota.
    - Password: Kata sandi untuk autentikasi.
    - Status_anggota: Status keanggotaan (misalnya aktif atau tidak).
  - Hubungan:
    - Memiliki: Anggota memiliki tugas yang diberikan kepada mereka.

Tugas
  - Atribut:
    - Id_tugas: Identifikasi unik untuk setiap tugas.
    - Nama_tugas: Nama dari tugas.
    - Deskripsi: Penjelasan mengenai tugas.
    - Nama_materi: Materi yang terkait dengan tugas.
    - Skala_pilotasi: Tingkat prioritas tugas.
    - Tenggat_waktu: Batas waktu penyelesaian tugas.
    - Status_tugas: Status terkini dari tugas (misalnya selesai, dalam proses, atau belum dimulai).
  - Hubungan:
    - Diakses: Tugas dapat diakses oleh PJ dan anggota.
    - Dimiliki: Tugas dimiliki oleh anggota yang ditugaskan.

## Project Structure
![image](https://github.com/user-attachments/assets/c4a757c5-4dcd-42ee-a68c-c1ff77703d00)

## Source Code dan Penjelasan
#### Package GUI
Folder ini berisi file Java yang berkaitan dengan antarmuka pengguna (GUI).


#### Package Image
#### Package Model

#### Library 
1. JCalendar
2. JDBC

## Output
Tampilan Selamat Datang
![image](https://github.com/user-attachments/assets/ac37804c-a3c0-4961-b56b-8e936e53eac8)
Tampilan Login
![image](https://github.com/user-attachments/assets/fbcf5215-8938-4fe9-a132-13b937993263)

Tampilan Menu PJ
![image](https://github.com/user-attachments/assets/1e0a8687-997d-4da5-bf28-ee18b5c5e786)

Tampilan Menu Anggota
![image](https://github.com/user-attachments/assets/cb8cc8c0-209a-4e2f-a7a2-30653379bb02)

Tampilan Sampai Jumpa
![image](https://github.com/user-attachments/assets/b9279b05-4434-4ffb-8ef3-80e0ba41c1de)
