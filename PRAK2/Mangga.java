package praktikum2.soal1;

public class Mangga{
    String nama;
    double berat;
    int jumlahBeli;
    double totalBerat;
    int totalharga;
    
    public Mangga(String n, double b, int jb, double tb){
    nama = n;
    berat = b;
    jumlahBeli = jb;
    totalBerat = tb;
    }
    
    public void display(){
        System.out.println("Nama Mangga: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Berat: " + totalBerat + " kg");
        System.out.println("Total Harga: Rp." + totalharga);
    }
}
