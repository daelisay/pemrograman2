package praktikum4.soal2;

public class komik extends buku {
    private Integer volume;
    private String sinopsis;
    
    public komik(String judul,String penulis,String tahun,Integer volume, String sinopsis) {
        this.judul=judul;
        this.penulis=penulis;
        this.tahun=Integer.parseInt(tahun);
        this.volume = volume;
        this.sinopsis = sinopsis;
}
    
    public String getKomikDetail(){
        return "Data yang baru diinputkan adalah\nSebuah komik dengan judul \"" + this.judul + "\". Komik tersebut dibuat oleh " + this.penulis + " dan diterbitkan pada tahun " + this.tahun + ". Sampai saat ini komik tersebut" + " memiliki jumlah volume sebanyak " + this.volume + " buah.\n" + "Sinopsis : " + this.sinopsis;
    }
}