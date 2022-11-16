package praktikum4.soal1;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        String judul;
        String penulis;
        Integer tahun;
        
        Scanner masuk = new Scanner(System.in);
      
        System.out.print("Judul: ");
        judul = masuk.nextLine();
        
        System.out.print("Penulis: ");
        penulis = masuk.nextLine();
        
        System.out.print("Tahun Terbit: ");
        tahun = masuk.nextInt();
        
        buku book = new buku(judul, penulis, tahun);
        book.display();
        masuk.close();
    }
}
