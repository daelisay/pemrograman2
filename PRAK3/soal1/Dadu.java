package praktikum3.soal1;

import java.util.Random;

public class Dadu {
    int Nilai;
    
    public void setNilai(int Nilai){
        this.Nilai = Nilai;
    }
    
    public int getNilai(){
        return Nilai;
    }
    
    public void AcakNilai(){
        this.Nilai = (int)(Math.random()*6) + 1;
    }
}
