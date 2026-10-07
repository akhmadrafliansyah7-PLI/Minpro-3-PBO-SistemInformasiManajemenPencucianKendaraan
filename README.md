# Minpro 3 - Pemrograman Berbasis Objek

## Identitas

Nama  : Akhmad Rafliansyah

NIM   : 2509116045

Prodi : Sistem Informasi 25'B

Tema  : Sistem Informasi Manajemen Pencucian Kendaraan

# Deskripsi Singkat Program

Program Sistem Pencucian Kendaraan merupakan aplikasi berbasis Java yang dibuat untuk mengelola data pencucian kendaraan secara terstruktur. 
Program ini mengelola data pelanggan, kendaraan, layanan, dan transaksi, serta menyediakan fitur untuk menambah, menampilkan, mengubah, dan 
menghapus data pencucian. Pengguna dapat memilih jenis kendaraan berupa mobil atau motor dan menentukan layanan pencucian yang tersedia 
beserta harganya. Program ini juga menerapkan konsep Object-Oriented Programming (OOP), seperti encapsulation pada pengelolaan atribut dan 
inheritance pada class Mobil dan Motor yang merupakan turunan dari class Kendaraan

# Penjelasan Struktur Package

Struktur package pada program Sistem Pencucian Kendaraan dibagi menjadi beberapa bagian agar kode lebih terorganisir dan setiap bagian 
memiliki fungsi masing-masing.

- Package sistempencuciankendaraan Berisi SistemPencucianKendaraan.java sebagai main class yang menjadi titik awal program.
- Package sistempencuciankendaraan. Controller Berisi MenuController.java yang berfungsi sebagai pengatur alur program, seperti
  menjalankan menu serta proses tambah, tampil, ubah, dan hapus data.
- Package sistempencuciankendaraan.Model Berisi class yang merepresentasikan data dan objek dalam sistem, yaitu Kendaraan, Mobil, Motor,
  Pelanggan, Layanan, Transaksi, serta BisaDicuci.
- Package sistempencuciankendaraan.View Berisi MenuView.java yang menangani tampilan menu dan input pengguna.

Secara keseluruhan, pembagian tersebut menggunakan pola MVC (Model–View–Controller), yaitu Model untuk mengelola data, View untuk 
tampilan dan input, sedangkan Controller untuk mengatur proses dan alur program.

# Penjelasan Alur Program

Program dimulai dengan menampilkan menu utama yang berisi beberapa pilihan, yaitu tambah data, tampilkan data, ubah data, hapus data, 
proses pencucisn, dan keluar dari program. Pengguna dapat memilih salah satu menu dengan memasukkan angka sesuai pilihan yang tersedia.

<img width="269" height="193" alt="Screenshot 2026-10-07 094153" src="https://github.com/user-attachments/assets/627f3b57-01bc-4bc9-b9fd-38e43b2b39c7" />

1. Tambah Data Pencucian
   
   Pada menu **Tambah Data Pencucian**, pengguna memilih menu 1, yaitu Tambah Data Pencucian. Pengguna kemudian memasukkan nama pelanggan, nomor     telepon, nomor plat, merk, dan warna kendaraan. Setelah itu, pengguna memilih jenis kendaraan, yaitu mobil atau motor. Pada contoh tersebut       dipilih mobil, sehingga pengguna memasukkan jumlah roda sebanyak 4. Selanjutnya, pengguna memilih layanan pencucian, yaitu cuci reguler atau      cuci premium; pada contoh dipilih Cuci Premium Mobil dengan harga Rp75.000. Setelah seluruh data dan layanan dipilih, sistem membuat data         transaksi dan menampilkan pesan “Data Pencucian Berhasil Ditambahkan!”, yang menandakan data berhasil disimpan ke dalam sistem.
   
  <img width="265" height="562" alt="Screenshot 2026-10-07 095248" src="https://github.com/user-attachments/assets/b1a79b70-dd55-4efc-8c82 1bea664cf003" />

2. Tampilkan Data Pencucian

   Pada menu **Tampilkan Data Pencucian**, sistem menampilkan seluruh data transaksi yang sebelumnya telah tersimpan. Setiap transaksi               ditampilkan secara lengkap, mulai dari ID transaksi, ID pelanggan, nama dan nomor telepon pelanggan, nomor plat, merk dan warna kendaraan,        jumlah roda, hingga kode, nama, dan harga layanan pencucian.

   <img width="260" height="629" alt="Screenshot 2026-10-07 095845" src="https://github.com/user-attachments/assets/cf9e9c59-8135-4341-b065-08d7ca653dae" />



