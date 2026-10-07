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

![Uploading image.png…]()

1. Tambah Data Pencucian
   
