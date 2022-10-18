/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal3;

/**
 *
 * @author ACER
 */
public class Soal3Main {
    public static void main(String[] args) {
        pegawai p1 = new pegawai();
        //terjadi error pada baris dibawah karena tidak menggunakan tanda semicolon dibelakangnya.
        //p1.nama = "Roi";
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.getUmur());
    }
}
