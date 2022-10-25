package praktikum3.soal2;

import java.util.Scanner;
import java.util.LinkedList;

public class Soal2Main {
 static Scanner masuk = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<Negara> Nation = new LinkedList<Negara>();
        int a;
        a = masuk.nextInt();
        masuk.nextLine();
        for(int i = 0; i < a; i++){
            Nation.add(inputNegara());    
        }
        while(!Nation.isEmpty()){
            Nation.poll().printDetail();
        }
        masuk.close();
    }
    
    public static Negara inputNegara(){
        String nama_negara;
        String jenis_kepemimpinan;
        String nama_pemimpin;
        int tgl_kemerdekaan;
        int bln_kemerdekaan;
        int thn_kemerdekaan;
        
        nama_negara = masuk.nextLine();
        jenis_kepemimpinan = masuk.nextLine();
        nama_pemimpin = masuk.nextLine();
        
        if(Negara.Monarch(jenis_kepemimpinan)){
            return new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin);
        }
        
        tgl_kemerdekaan = masuk.nextInt();
        masuk.nextLine();
        bln_kemerdekaan = masuk.nextInt();
        masuk.nextLine();
        thn_kemerdekaan = masuk.nextInt();
        masuk.nextLine();
        return new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin, tgl_kemerdekaan, bln_kemerdekaan, thn_kemerdekaan);
    }
}
