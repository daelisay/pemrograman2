package praktikum2.soal2;
        
public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    double harga;
    private String pemilik;
    double pajak;
    
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    } 

    public String getTahun_keluaran() {
        return tahun_keluaran;
    }

    public void setTahun_keluaran(String tahun_keluaran) {
        this.tahun_keluaran = tahun_keluaran;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public double getPajak(double pajak) {
       this.pajak = 202700000*0.2;
        return pajak;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }
    
    public void info(){
        System.out.println("Merek Mobil: " + getMerek());
        System.out.println("Harga: " + getHarga());
        System.out.println("Tahun Keluaran: " + getTahun_keluaran());
        System.out.println("Kapasitas: " + getKapasitas() + "c");
    }
}
