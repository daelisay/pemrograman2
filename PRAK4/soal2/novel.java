package praktikum4.soal2;

public class novel extends buku {
    private String genre, sinopsis;

    public novel(String judul, String penulis, String tahun, String genre, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = Integer.parseInt(tahun);
        this.genre = genre;
        this.sinopsis = sinopsis;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenre() {
        return genre;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    
    public String getNovelDetail(){
        return "Data yang baru diinputkan adalah\nSebuah novel bergenre " + this.genre + " dengan judul \"" + this.judul + "\". Novel tersebut ditulis oleh " + this.penulis + " dan diterbitkan pada tahun " + this.tahun + ".\n" + "Sinopsis : " + this.sinopsis;
    }
}
