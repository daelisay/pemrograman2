package praktikum3.soal1;

import java.util.Scanner;
import java.util.LinkedList;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        LinkedList<Dadu> Dice = new LinkedList<>();
        
        System.out.print("Input: ");
        int n = masuk.nextInt();
        
        int jumlah = 0;
        int temp;
        Dadu tempDadu;
        
        for(int i = 0; i < n; i++){
            tempDadu = new Dadu();
            tempDadu.AcakNilai();
            Dice.add(tempDadu);
        }
        
        for(int i = 0; i < n; i++){
            temp = Dice.poll().getNilai();
            System.out.println("Dadu ke-" + (i+1) + " bernilai " + temp);
            jumlah += temp;
        }
        System.out.println("Total nilai dadu keseluruhan " + jumlah);
    }
}
