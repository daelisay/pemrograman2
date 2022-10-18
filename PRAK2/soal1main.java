package praktikum2.soal1;

public class soal1main {
    public static void main(String[] args){
        Mangga Arumanis = new Mangga("Arumanis", 0.3, 13, 3.9);
        Mangga Manalagi = new Mangga("Manalagi", 0.5, 17, 8.5);
        Mangga Madu = new Mangga("Madu", 0.375, 12, 4.5);
        Arumanis.totalharga = 65000;
        Manalagi.totalharga = 127500;
        Madu.totalharga = 78000;
        
        Arumanis.display();
        System.out.println("");
        Manalagi.display();
        System.out.println("");
        Madu.display();
        System.out.println("");
    }
}
