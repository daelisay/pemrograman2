package praktikum4.soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan pilihan: ");
        int choice = masuk.nextInt();
        masuk.nextLine();

        System.out.print("Judul: ");
        String judul=masuk.nextLine();
        System.out.print("Penulis: ");
        String penulis=masuk.nextLine();
        System.out.print("Tahun Terbit: ");
        String tahun=masuk.next();
        masuk.nextLine();
        
        if(choice == 1){
            System.out.print("Genre: ");
            String genre = masuk.nextLine();
            System.out.print("Sinopsis: ");
            String sinopsis = masuk.nextLine();
            novel Novel = new novel(judul, penulis, tahun, genre, sinopsis);
            System.out.println(Novel.getNovelDetail());
        }else if(choice == 2){
            System.out.print("Volume: ");
            Integer volume = masuk.nextInt();
            masuk.nextLine();
            System.out.print("Sinopsis: ");
            String sinopsis = masuk.nextLine();
            komik Komik = new komik(judul, penulis, tahun, volume, sinopsis);
            System.out.println(Komik.getKomikDetail());
        }
    }
}
