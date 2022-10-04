package PRAK1;

import java.util.Scanner;

public class PRAK105_2010817220030_FajraHanifaNuridiRadam {
    public static void main(String[] args) {
        System.out.println("== Program Perhitungan Volume Tabung ==\n");
        Scanner input = new Scanner(System.in);
             double hasil1, hasil2, r, t;
             double phi = 3.14;
       
        System.out.print("Masukkan Jari-Jari : ");
             r = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
             t = input.nextDouble();
       
        hasil2 = r;
        hasil1 = (phi * hasil2 * hasil2 * t);
       
        System.out.println("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah " + hasil1 + " m3");
    }
}
