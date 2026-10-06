/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;

/**
 *
 * @author Lenovo GK
 */
public class Motor extends Kendaraan{
    
    private int cc;
    
    public Motor(String noPlat, String merk, String warna, int cc, Layanan layanan){
        super(noPlat, merk, warna, layanan);
        this.cc = cc;
    }
    
    @Override
    public void tampilkanData(){
        super.tampilkanData();
   
System.out.println("Jenis Kendaraan : Motor");
System.out.println("CC : " + cc);
System.out.println("Kode Layanan : " + getLayanan().getKodeLayanan());
System.out.println("Layanan : " + getLayanan().getNamaLayanan());
System.out.println("Harga Rp : " + getLayanan().getHarga());
    }
}