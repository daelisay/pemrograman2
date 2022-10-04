package PRAK1;

import java.util.Scanner;

public class PRAK101_2010817220030_FajraHanifaNuridiRadam {
    public static void main(String[] args){
    Scanner masuk = new Scanner(System.in);
        String nama;
        System.out.println("Masukkan Nama Lengkap: ");
        nama = masuk.nextLine();
        
        String tempat;
        System.out.println("Masukkan Tempat Lahir: ");
        tempat = masuk.nextLine();
        
        int tanggal;
        System.out.println("Masukkan Tanggal Lahir: ");
        tanggal = masuk.nextInt();
        
        int bulan;
        String namaBulan = null;
        System.out.println("Masukkan Bulan Lahir: ");
        bulan = masuk.nextInt();
        if (bulan == 1) namaBulan = "Januari";
        else if (bulan == 2) namaBulan = "Februari";
        else if (bulan == 3) namaBulan = "Maret";
        else if (bulan == 4) namaBulan = "April";
        else if (bulan == 5) namaBulan = "Mei";
        else if (bulan == 6) namaBulan = "Juni";
        else if (bulan == 7) namaBulan = "Juli";
        else if (bulan == 8) namaBulan = "Agustus";
        else if (bulan == 9) namaBulan = "September";
        else if (bulan == 10) namaBulan = "Oktober";
        else if (bulan == 11) namaBulan = "November";
        else if (bulan == 12) namaBulan = "Desember";
        
        int tahun;
        System.out.println("Masukkan Tahun Lahir: ");
        tahun = masuk.nextInt();
        
        int tinggi;
        System.out.println("Masukkan Tinggi Badan: ");
        tinggi = masuk.nextInt();
        
        double berat;
        System.out.println("Masukkan Berat Badan: ");
        berat = masuk.nextDouble();
        
        System.out.println("Data Telah Ditambahkan,");
        System.out.println("Nama Lengkap " + nama +", Lahir di "+tempat+" pada Tanggal "+tanggal+" "+namaBulan+" "+tahun);
        System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");
}
}