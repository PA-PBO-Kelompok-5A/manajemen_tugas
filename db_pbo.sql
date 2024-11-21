-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Nov 2024 pada 16.01
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `status_anggota` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`nim`, `nama`, `password`, `status_anggota`) VALUES
('12345', 'mimin', '12345', 'aktif'),
('2309116001', 'Muhammad Nur Fadilah', '12345', 'aktif'),
('2309116002', 'Nyoman Arini Trirahayu', '12345', 'aktif'),
('2309116004', 'Tri Rahayu Septiyani', '12345', 'aktif'),
('2309116006', 'Lisa Nafrathiloya', '12345', 'aktif'),
('2309116007', 'Reyfaldho Alfarazzel', '12345', 'aktif'),
('2309116008', 'Alya Rizqi Ramadhani', '12345', 'aktif'),
('2309116009', 'Alyssa Dwiana Mulia', '12345', 'aktif'),
('2309116010', 'Athira Fahmi', '12345', 'aktif'),
('2309116011', 'Diva Tri Andini', '12345', 'aktif'),
('2309116012', 'Hana Anastasya Wardah', '12345', 'aktif'),
('2309116013', 'Siti Annida Adzra', '12345', 'aktif'),
('2309116014', 'Aidhil Saputra', '12345', 'aktif'),
('2309116015', 'Irene Mi\'raj Nur Sari', '12345', 'aktif'),
('2309116016', 'Fitri Yanti', '12345', 'aktif'),
('2309116018', 'Nazwa Tri Ananda', '12345', 'aktif'),
('2309116019', 'Widia Saputri', '12345', 'aktif'),
('2309116020', 'Muhammad Hisyam Nugroho', '12345', 'aktif'),
('2309116021', 'Fitriani', '12345', 'aktif'),
('2309116022', 'Mohammad Imam Farizy', '12345', 'mengundurkan diri'),
('2309116023', 'Adinda Salsabilla Naura', '12345', 'aktif'),
('2309116024', 'Nelly Oktavia Redeca', '12345', 'aktif'),
('2309116025', 'Muhammad Khairu Fadilah', '12345', 'aktif'),
('2309116026', 'Rofi Hanif Fauzan', '12345', 'aktif'),
('2309116027', 'Muhammad Aryaputra Wirawan', '12345', 'aktif'),
('2309116028', 'Farhan Imannudin', '12345', 'aktif'),
('2309116029', 'Muhammad Rofiif Taqiyyuddin Nabiil ', '12345', 'aktif'),
('2309116030', 'Noor Lintang Bhaskara ', '12345', 'aktif'),
('2309116031', 'Muhammad Dzaky Irawan', '12345', 'aktif'),
('2309116032', 'Naura Syawal Athallah Putri', '12345', 'mengundurkan diri'),
('2309116033', 'Muhammad Pidha Iqbal Fadillah', '12345', 'aktif'),
('2309116034', 'Muhammad Alfian Adien', '12345', 'aktif'),
('2309116035', 'Muhammad Nabil Ma\'ruf', '12345', 'aktif'),
('2309116036', 'Yasmin Alya Aziza', '12345', 'aktif'),
('2309116037', 'Dhea Amalia Putri', '12345', 'aktif'),
('2309116038', 'Andromeda Hibnu Darmawi', '12345', 'aktif'),
('2309116039', 'Muhammad Rizky Setiawan', '12345', 'aktif'),
('2309116040', 'Muhammad Aidil Mirza', '12345', 'aktif'),
('2309116041', 'David Sebastian Sutandy', '12345', 'aktif'),
('2309116042', 'Rifqi Hadi Wijaya', '12345', 'aktif'),
('2309116043', 'Nova Nur Fauziah', '12345', 'aktif'),
('2309116046', 'Khalil Pradipta Lee', '12345', 'aktif'),
('2309116048', 'Muhammad Hafidh Shovi', '12345', 'aktif'),
('2309116049', 'Esra Fernanda Siregar', '12345', 'aktif'),
('2309116050', 'Najla Nayla Putri', '12345', 'aktif'),
('2309116051', 'Muhammad Faisal Ramdhani', '12345', 'aktif');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pj`
--

CREATE TABLE `pj` (
  `nim` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `no_telpon` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pj`
--

INSERT INTO `pj` (`nim`, `nama`, `password`, `no_telpon`) VALUES
('2309116028', 'Farhan Imannudin', 'adminaseli', '085249775899'),
('678', 'alya', '678', '08678');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tugas`
--

CREATE TABLE `tugas` (
  `id_tugas` int(11) NOT NULL,
  `nama_tugas` varchar(50) NOT NULL,
  `deskripsi_tugas` longtext NOT NULL,
  `nama_matkul` varchar(50) NOT NULL,
  `skala_prioritas` varchar(20) NOT NULL,
  `tenggat_waktu` varchar(20) NOT NULL,
  `status_tugas` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tugas`
--

INSERT INTO `tugas` (`id_tugas`, `nama_tugas`, `deskripsi_tugas`, `nama_matkul`, `skala_prioritas`, `tenggat_waktu`, `status_tugas`) VALUES
(5, 'Penerapan inheritance', 'Membuat program sederhana dengan menerapkan inheritance dengan menerapkan dua role admin dan user\r\n', 'Pemrograman Berbasis Objek', '3 (tinggi)', '01/12/2024', 'Aktif'),
(6, 'VLAN', 'Konfigurasi VLAN dengan menerapkan minimal 4 ruangan', 'Desain Manajemen Jaringan Komputer', '1 (rendah)', '21/11/2024', 'Tidak Aktif'),
(7, 'Program sederhana ', 'Membuat program sederhana dengan menerapkan polymorphism dan inheritance dengan minimal 3 packages', 'Pemrograman Berbasis Objek', '3 (tinggi)', '30/11/2024', 'Aktif'),
(8, 'Proses bisnis UMKM', 'Buatkan proses bisnis UMKM yang ada di Samarinda dengan menggunakan aplikasi Bizagi', 'Desain Manajemen Proses Bisnis', '2 (sedang)', '08/12/2024', 'Aktif'),
(9, 'Routing ', 'Lakukan konfigurasi Routing dan buatkan laporan', 'Desain Manajemen Jaringan Komputer', '1 (rendah)', '21/11/2024', 'Tidak Aktif'),
(10, 'Metode Monte Carlo', 'Jelaskan perhitungan langkah-langkah dengan Metode Monte Carlo', 'Riset Operasi', '1 (rendah)', '15/12/2024', 'Aktif'),
(11, 'Presentasi Kelompok', 'Buat kelompok beranggotakan 3 orang untuk mempresentasikan sejarah komputer', 'Interaksi Manusia dan Komputer', '2 (sedang)', '12/12/2024', 'Aktif'),
(12, 'Mini Project 2', 'Buatlah sebuah Entity Relationship Diagram (ERD) sesuai dengan tema kalian yang telah disetujui menggunakan Datamodeler', 'Desain Basis Data', '3 (tinggi)', '01/12/2024', 'Aktif'),
(14, 'adad', 'ada', 'Riset Operasi', '3 (Tinggi)', 'adada', 'Tidak Aktif');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `pj`
--
ALTER TABLE `pj`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `tugas`
--
ALTER TABLE `tugas`
  ADD PRIMARY KEY (`id_tugas`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tugas`
--
ALTER TABLE `tugas`
  MODIFY `id_tugas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
